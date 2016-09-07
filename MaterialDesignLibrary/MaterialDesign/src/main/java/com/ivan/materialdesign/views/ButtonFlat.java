package com.ivan.materialdesign.views;

import com.ivan.materialdesign.R;
import com.ivan.materialdesign.utils.Utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ButtonFlat extends Button {

    TextView textButton;
    private Typeface typeface;

    public ButtonFlat(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    protected void setDefaultProperties() {
        minHeight = 36;
        minWidth = 88;
        rippleSize = 3;
        // Min size
        setMinimumHeight(Utils.dpToPx(minHeight, getResources()));
        setMinimumWidth(Utils.dpToPx(minWidth, getResources()));
        setBackgroundResource(R.drawable.background_transparent);
    }

    @Override
    protected void setAttributes(AttributeSet attrs) {
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
            textButton.setTextColor(backgroundColor);
            textButton.setTypeface(null, Typeface.BOLD);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
            textButton.setLayoutParams(params);
            addView(textButton);
        }
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


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (x != -1) {

            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(makePressColor());
            canvas.drawCircle(x, y, radius, paint);
            if (radius > getHeight() / rippleSize)
                radius += rippleSpeed;
            if (radius >= getWidth()) {
                x = -1;
                y = -1;
                radius = getHeight() / rippleSize;
                if (onClickListener != null && clickAfterRipple)
                    onClickListener.onClick(this);
            }
            invalidate();
        }

    }

    /**
     * Make a dark color to ripple effect
     */
    @Override
    protected int makePressColor() {
        return Color.parseColor("#88DDDDDD");
    }

    @Override
    public void setText(String text) {
        textButton.setText(text);
    }

    @Override
    public void setTextColor(int color) {
        backgroundColor = color;
        if (isEnabled())
            beforeBackground = backgroundColor;
        textButton.setTextColor(color);
    }

    // Set color of background
    public void setBackgroundColor(int color) {
        backgroundColor = color;
        if (isEnabled())
            beforeBackground = backgroundColor;
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

    @Override
    public void setTypeFace(Typeface typeFace) {
        textButton.setTypeface(typeFace);
    }

}
