package com.ivan.materialdesign.views;

import com.ivan.materialdesign.R;
import com.ivan.materialdesign.utils.Utils;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ButtonRectangle extends Button {

    TextView textButton;
    private Typeface typeface;

    public ButtonRectangle(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDefaultProperties();
    }

    @Override
    protected void setDefaultProperties() {
        super.minWidth = 80;
        super.minHeight = 36;
        super.background = R.drawable.background_button_rectangle;
        super.setDefaultProperties();
    }


    // Set atributtes of XML to View
    protected void setAttributes(AttributeSet attrs) {

        //Set background Color
        // Color by resource
        int bacgroundColor = attrs.getAttributeResourceValue(ANDROIDXML, "background", -1);
        if (bacgroundColor != -1) {
            setBackgroundColor(ContextCompat.getColor(getContext(), bacgroundColor));
        } else {
            // Color by hexadecimal
            // Color by hexadecimal
            background = attrs.getAttributeIntValue(ANDROIDXML, "background", -1);
            if (background != -1)
                setBackgroundColor(background);
        }

        // Set text button
        String text;
        int textResource = attrs.getAttributeResourceValue(ANDROIDXML, "text", -1);
        if (textResource != -1) {
            text = getResources().getString(textResource);
        } else {
            text = attrs.getAttributeValue(ANDROIDXML, "text");
        }
        if (text != null) {
            textButton = new TextView(getContext());
            textButton.setText(text);
            textButton.setTextColor(Color.WHITE);
            textButton.setTypeface(null, Typeface.BOLD);
            LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
            params.setMargins(Utils.dpToPx(5, getResources()), Utils.dpToPx(5, getResources()), Utils.dpToPx(5, getResources()), Utils.dpToPx(5, getResources()));
            textButton.setLayoutParams(params);
            addView(textButton);
//					FrameLayout.LayoutParams params = (LayoutParams) textView.getLayoutParams();
//					params.width = getWidth();
//					params.gravity = Gravity.CENTER_HORIZONTAL;
////					params.setMargins(paddingLeft, paddingTop, paddingRight, paddingRight);
//					textView.setLayoutParams(params);textColor
            int textColor = attrs.getAttributeResourceValue(ANDROIDXML, "textColor", -1);
            if (textColor != -1) {
                textButton.setTextColor(ContextCompat.getColor(getContext(), textColor));
            } else {
                // Color by hexadecimal
                // Color by hexadecimal
                textColor = attrs.getAttributeIntValue(ANDROIDXML, "textColor", -1);
                if (textColor != -1)
                    textButton.setTextColor(textColor);
            }
            int[] array = {android.R.attr.textSize};
            TypedArray values = getContext().obtainStyledAttributes(attrs, array);
            float textSize = values.getDimension(0, -1);
            values.recycle();
            if (textSize != -1)
                textButton.setTextSize(textSize);

            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CustomAttributes);
            String typefacePath = typedArray.getString(R.styleable.CustomAttributes_typeFaceButton);
            if (typefacePath != null) {
                typeface = Typeface.createFromAsset(getContext().getAssets(), typefacePath);
            }
            typedArray.recycle();
            if (typeface != null) {
                textButton.setTypeface(typeface);
            }
        }

        rippleSpeed = attrs.getAttributeFloatValue(MATERIALDESIGNXML,
                "rippleSpeed", Utils.dpToPx(6, getResources()));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (x != -1) {
            Rect src = new Rect(0, 0, getWidth() - Utils.dpToPx(6, getResources()), getHeight() - Utils.dpToPx(7, getResources()));
            Rect dst = new Rect(Utils.dpToPx(6, getResources()), Utils.dpToPx(6, getResources()), getWidth() - Utils.dpToPx(6, getResources()), getHeight() - Utils.dpToPx(7, getResources()));
            canvas.drawBitmap(makeCircle(), src, dst, null);
            invalidate();
        }
    }

    @Override
    public void setTypeFace(Typeface typeFace) {
        textButton.setTypeface(typeFace);
    }

    @Override
    public void setText(String text) {
        textButton.setText(text);
    }

    @Override
    public void setTextColor(int color) {
        textButton.setTextColor(color);
    }

    @Override
    public TextView getTextView() {
        return textButton;
    }

    @Override
    public String getText() {
        return textButton.getText().toString();
    }

}
