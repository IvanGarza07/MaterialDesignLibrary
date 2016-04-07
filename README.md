# MaterialDesignLibrary
<article class="markdown-body entry-content" itemprop="text"><p><a href="/images/logo.png" target="_blank"><img src="/images/logo.png" alt="Material design library logo" style="max-width:100%;"></a></p>

<h1><a id="user-content-material-design-android-library" class="anchor" href="#material-design-android-library" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Material Design Android Library</h1>

<ul>
<li><a href="#howtouse">How to use</a></li>
<li><a href="#components">Components</a>

<ul>
<li><a href="#buttons">Buttons</a>

<ul>
<li><a href="#flat-button">Flat Button</a></li>
<li><a href="#rectangle-button">Rectangle Button</a></li>
<li><a href="#float-button">Float Button</a></li>
<li><a href="#float-small-button">Float small button</a></li>
</ul></li>
<li><a href="#switches">Switches</a>

<ul>
<li><a href="#checkbox">CheckBox</a></li>
<li><a href="#switch">Switch</a></li>
</ul></li>
<li><a href="#progress-indicators">Progress indicators</a>

<ul>
<li><a href="#progress-bar-circula-rindeterminate">Progress bar circular indeterminate</a></li>
<li><a href="#progress-bar-indeterminate">Progress bar indeterminate</a></li>
<li><a href="#progress-bar-indeterminate-determinate">Progress bar indeterminate determinate</a></li>
<li><a href="#progress-bar-determinate">Progress bar determinate</a></li>
<li><a href="#slider">Slider</a></li>
<li><a href="#slider-with-number-indicator">Slider with number indicator</a></li>
</ul></li>
</ul></li>
<li><a href="#widgets">Widgets</a>

<ul>
<li><a href="#snackbar">SnackBar</a></li>
<li><a href="#dialog">Dialog</a></li>
<li><a href="#color-selector">Color selector</a></li>
</ul></li>
</ul>

<h2><a id="user-content-how-to-use" class="anchor" href="#how-to-use" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>How to use</h2>

<p>If you want use this library, you only have to download MaterialDesign project, import it into your workspace and add the project as a library in your android project settings.</p>

<p>If you prefer it, you can use the gradle dependency, you have to add these lines in your build.gradle file:</p>

<div class="highlight highlight-text-xml"><pre>repositories {
    maven {
        url "https://jitpack.io"
    }
}

dependencies {
    compile 'com.github.IvanGarza07:MaterialDesignLibrary:1.0.2'
}</pre></div>


<p>If you use other libraries requiring nineoldandroids and appcompat-v7 like <a href="https://github.com/rengwuxian/MaterialEditText/">MaterialEditText</a> or MaterialSpinner make sure to exclude them :</p>

<div class="highlight highlight-source-groovy"><pre>compile (<span class="pl-s"><span class="pl-pds">'</span>com.github.IvanGarza07:MaterialDesignLibrary:1.0.2<span class="pl-pds">'</span></span>){
        exclude <span class="pl-c1">group</span>: <span class="pl-s"><span class="pl-pds">'</span>com.nineoldandroids<span class="pl-pds">'</span></span>, <span class="pl-c1">module</span>: <span class="pl-s"><span class="pl-pds">'</span>library<span class="pl-pds">'</span></span>
        exclude <span class="pl-c1">group</span>: <span class="pl-s"><span class="pl-pds">'</span>com.android.support<span class="pl-pds">'</span></span>, <span class="pl-c1">module</span>: <span class="pl-s"><span class="pl-pds">'</span>appcompat-v7<span class="pl-pds">'</span></span>
}</pre></div>

<p>Some components have custom attributes, if you want use them, you must add this line in your xml file in the first component:</p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">RelativeLayout</span> <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">android</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res/android<span class="pl-pds">"</span></span>
    <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">materialdesign</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res-auto<span class="pl-pds">"</span></span>
    <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
    <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
    &gt;
&lt;/<span class="pl-ent">RelativeLayout</span>&gt;</pre></div>

<blockquote>
<p>If you are going to use a ScrollView, it is recommended that you use the CustomScrollView provided in this library to avoid problems with the custom components.
To use this component:</p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ScrollView 
   <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">android</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res/android<span class="pl-pds">"</span></span>
   <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">materialdesign</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res-auto<span class="pl-pds">"</span></span>
   <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/scroll<span class="pl-pds">"</span></span>
   <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
   <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>&gt;
&lt;/<span class="pl-ent">com</span>.gc.materialdesign.views.ScrollView&gt;</pre></div>
</blockquote>

<h2><a id="user-content-components" class="anchor" href="#components" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Components</h2>

<h4><a id="user-content-buttons" class="anchor" href="#buttons" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Buttons</h4>

<h6><a id="user-content-flat-button" class="anchor" href="#flat-button" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Flat Button</h6>

<p><a href="/images/flat_button.png" target="_blank"><img src="/images/flat_button.png" alt="flat button" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ButtonFlat
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/buttonflat<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">text</span>=<span class="pl-s"><span class="pl-pds">"</span>Button<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h6><a id="user-content-rectangle-button" class="anchor" href="#rectangle-button" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Rectangle Button</h6>

<p><a href="/images/rectangle_button.png" target="_blank"><img src="images/rectangle_button.png" alt="rectangle button" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ButtonRectangle
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/button<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">text</span>=<span class="pl-s"><span class="pl-pds">"</span>Button<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h6><a id="user-content-float-button" class="anchor" href="#float-button" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Float Button</h6>

<p><a href="/images/float_button.png" target="_blank"><img src="/images/float_button.png" alt="float button" style="max-width:100%;"></a></p>

<blockquote>
<p>It is recommended to put this component in the right-bottom of the screen. To use this component write this code in your xml file.
If you don`t want to start this component with animation set the animate attribute to false.
Put your icon in the icon attribute to set the drawable icon for this component.</p>
</blockquote>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">RelativeLayout</span> <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">android</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res/android<span class="pl-pds">"</span></span>
    <span class="pl-e">xmlns</span><span class="pl-e">:</span><span class="pl-e">materialdesign</span>=<span class="pl-s"><span class="pl-pds">"</span>http://schemas.android.com/apk/res-auto<span class="pl-pds">"</span></span>
    <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
    <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>match_parent<span class="pl-pds">"</span></span>
    &gt;
    <span class="pl-c">&lt;!-- ... XML CODE --&gt;</span>
    &lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ButtonFloat
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/buttonFloat<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_alignParentRight</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_alignParentBottom</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_marginRight</span>=<span class="pl-s"><span class="pl-pds">"</span>24dp<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">animate</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">iconDrawable</span>=<span class="pl-s"><span class="pl-pds">"</span>@drawable/ic_action_new<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">RelativeLayout</span>&gt;</pre></div>

<h6><a id="user-content-float-small-button" class="anchor" href="#float-small-button" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Float small button</h6>

<p><a href="/images/float_small_button.png" target="_blank"><img src="/images/float_small_button.png" alt="float small button" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ButtonFloatSmall
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/buttonFloatSmall<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">iconDrawable</span>=<span class="pl-s"><span class="pl-pds">"</span>@drawable/ic_action_new<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h4><a id="user-content-switches" class="anchor" href="#switches" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Switches</h4>

<h6><a id="user-content-checkbox" class="anchor" href="#checkbox" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>CheckBox</h6>

<p><a href="/images/checkbox.png" target="_blank"><img src="/images/checkbox.png" alt="checkbox" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.CheckBox
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/checkBox<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">check</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h6><a id="user-content-switch" class="anchor" href="#switch" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Switch</h6>

<p><a href="/images/switch.png" target="_blank"><img src="/images/switch.png" alt="switch" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.Switch
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/switchView<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">check</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h4><a id="user-content-progress-indicators" class="anchor" href="#progress-indicators" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Progress indicators</h4>

<h6><a id="user-content-progress-bar-circular-indeterminate" class="anchor" href="#progress-bar-circular-indeterminate" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Progress bar circular indeterminate</h6>

<p><a href="/images/progress_bar_circular_indeterminate.png" target="_blank"><img src="/images/progress_bar_circular_indeterminate.png" alt="progress bar circular indeterminate" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ProgressBarCircularIndeterminate
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/progressBarCircularIndeterminate<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>32dp<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>32dp<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h6><a id="user-content-progress-bar-indeterminate" class="anchor" href="#progress-bar-indeterminate" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Progress bar indeterminate</h6>

<p><a href="/images/progress_bar_indeterminate.png" target="_blank"><img src="/images/progress_bar_indeterminate.png" alt="progress bar indeterminate" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ProgressBarIndeterminate
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/progressBarIndeterminate<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span> /&gt;</pre></div>

<h6><a id="user-content-progress-bar-indeterminate-determinate" class="anchor" href="#progress-bar-indeterminate-determinate" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Progress bar indeterminate determinate</h6>

<p><a href="/images/progress_bar_indeterminate_determinate.png" target="_blank"><img src="/images/progress_bar_indeterminate_determinate.png" alt="Progress bar indeterminate determinate" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ProgressBarIndeterminateDeterminate
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/progressBarIndeterminateDeterminate<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span> /&gt;</pre></div>

<blockquote>
<p>If you begin progrees, you only have to set progress it</p>

<div class="highlight highlight-source-java"><pre>progressBarIndeterminateDeterminate<span class="pl-k">.</span>setProgress(progress);</pre></div>
</blockquote>

<h6><a id="user-content-progress-bar-determinate" class="anchor" href="#progress-bar-determinate" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Progress bar determinate</h6>

<p><a href="/images/progress_bar_determinate.png" target="_blank"><img src="/images/progress_bar_determinate.png" alt="Progress bar determinate" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.ProgressBarDeterminate
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/progressDeterminate<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span> /&gt;</pre></div>

<blockquote>
<p>You can custom max and min progress values with <code>materialdesign:max="50"</code> and <code>materialdesign:min="25"</code> attributes.</p>
</blockquote>

<h6><a id="user-content-slider" class="anchor" href="#slider" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Slider</h6>

<p><a href="/images/slider.png" target="_blank"><img src="/images/slider.png" alt="Slider" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.Slider
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/slider<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">max</span>=<span class="pl-s"><span class="pl-pds">"</span>50<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">min</span>=<span class="pl-s"><span class="pl-pds">"</span>0<span class="pl-pds">"</span></span>
                 /&gt;</pre></div>

<h6><a id="user-content-slider-with-number-indicator" class="anchor" href="#slider-with-number-indicator" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Slider with number indicator</h6>

<p><a href="/images/slider_with_number_indicator.png" target="_blank"><img src="/slider_with_number_indicator.png" alt="Slider with number indicator" style="max-width:100%;"></a></p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.views.Slider
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/slider<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span>
                <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">background</span>=<span class="pl-s"><span class="pl-pds">"</span>#1E88E5<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">max</span>=<span class="pl-s"><span class="pl-pds">"</span>50<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">min</span>=<span class="pl-s"><span class="pl-pds">"</span>0<span class="pl-pds">"</span></span>
                <span class="pl-e">materialdesign</span><span class="pl-e">:</span><span class="pl-e">showNumberIndicator</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span>/&gt;</pre></div>

<h2><a id="user-content-widgets" class="anchor" href="#widgets" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Widgets</h2>

<h4><a id="user-content-snackbar" class="anchor" href="#snackbar" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>SnackBar</h4>

<p><a href="/images/snackbar.png" target="_blank"><img src="/images/snackbar.png" alt="Snackbar" style="max-width:100%;"></a></p>

<div class="highlight highlight-source-java"><pre><span class="pl-smi">SnackBar</span> snackbar <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">SnackBar</span>(<span class="pl-smi">Activity</span> activity, <span class="pl-smi">String</span> text, <span class="pl-smi">String</span> buttonText, <span class="pl-smi">View</span><span class="pl-k">.</span><span class="pl-smi">OnClickListener</span> onClickListener);
snackbar<span class="pl-k">.</span>show();</pre></div>

<blockquote>
<p>If you don't want to show the button, put <code>null</code> in <code>buttonText</code> attribute</p>
</blockquote>

<h4><a id="user-content-dialog" class="anchor" href="#dialog" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Dialog</h4>

<p><a href="/images/dialog.png" target="_blank"><img src="/images/dialog.png" alt="Dialog" style="max-width:100%;"></a></p>

<div class="highlight highlight-source-java"><pre><span class="pl-smi">Dialog</span> dialog <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Dialog</span>(<span class="pl-smi">Context</span> context,<span class="pl-smi">String</span> title, <span class="pl-smi">String</span> message);
dialog<span class="pl-k">.</span>show();</pre></div>

<blockquote>
<p>You can set the accept and cancel button on the event listener or change it's text</p>

<div class="highlight highlight-source-java"><pre><span class="pl-c">// Set accept click listenner</span>
dialog<span class="pl-k">.</span>setOnAcceptButtonClickListener(<span class="pl-smi">View</span><span class="pl-k">.</span><span class="pl-smi">OnClickListener</span> onAcceptButtonClickListener);
<span class="pl-c">// Set cancel click listenner</span>
dialog<span class="pl-k">.</span>setOnCancelButtonClickListener(<span class="pl-smi">View</span><span class="pl-k">.</span><span class="pl-smi">OnClickListener</span> onCancelButtonClickListener);
<span class="pl-c">// Acces to accept button</span>
<span class="pl-smi">ButtonFlat</span> acceptButton <span class="pl-k">=</span> dialog<span class="pl-k">.</span>getButtonAccept();
<span class="pl-c">// Acces to cancel button</span>
<span class="pl-smi">ButtonFlat</span> cancelButton <span class="pl-k">=</span> dialog<span class="pl-k">.</span>getButtonCancel();</pre></div>
</blockquote>

<h4><a id="user-content-color-selector" class="anchor" href="#color-selector" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Color selector</h4>

<p><a href="/images/color_selector.png" target="_blank"><img src="/images/color_selector.png" alt="Color selector" style="max-width:100%;"></a></p>

<div class="highlight highlight-source-java"><pre><span class="pl-smi">ColorSelector</span> colorSelector <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ColorSelector</span>(<span class="pl-smi">Context</span> context,<span class="pl-k">int</span> intialColor, <span class="pl-smi">OnColorSelectedListener</span> onColorSelectedListener);
colorSelector<span class="pl-k">.</span>show();</pre></div>

<h1><a id="user-content-materialspinner" class="anchor" href="#materialspinner" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>MaterialSpinner</h1>
<p>Spinner with Material Design - Down to API 9</p>

<p>This library provides you a Spinner with the Material style. You can use it like any regular Spinner. 
Add floating label text, hint and error messages.</p>

<h2><a id="user-content-screenshots" class="anchor" href="#screenshots" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Screenshots</h2>

<p><a href="/images/screenshot.gif" target="_blank"><img src="/images/screenshot.gif" alt="MaterialSpinner" style="max-width:100%;"></a></p>

<h2><a id="user-content-usages" class="anchor" href="#usages" aria-hidden="true"><svg aria-hidden="true" class="octicon octicon-link" height="16" role="img" version="1.1" viewBox="0 0 16 16" width="16"><path d="M4 9h1v1h-1c-1.5 0-3-1.69-3-3.5s1.55-3.5 3-3.5h4c1.45 0 3 1.69 3 3.5 0 1.41-0.91 2.72-2 3.25v-1.16c0.58-0.45 1-1.27 1-2.09 0-1.28-1.02-2.5-2-2.5H4c-0.98 0-2 1.22-2 2.5s1 2.5 2 2.5z m9-3h-1v1h1c1 0 2 1.22 2 2.5s-1.02 2.5-2 2.5H9c-0.98 0-2-1.22-2-2.5 0-0.83 0.42-1.64 1-2.09v-1.16c-1.09 0.53-2 1.84-2 3.25 0 1.81 1.55 3.5 3 3.5h4c1.45 0 3-1.69 3-3.5s-1.5-3.5-3-3.5z"></path></svg></a>Usages</h2>

<p>In the xml : </p>

<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">com</span>.ivan.materialdesign.widgets.MaterialSpinner
        <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>@+id/spinner<span class="pl-pds">"</span></span>
        <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_width</span>=<span class="pl-s"><span class="pl-pds">"</span>fill_parent<span class="pl-pds">"</span></span>
        <span class="pl-e">android</span><span class="pl-e">:</span><span class="pl-e">layout_height</span>=<span class="pl-s"><span class="pl-pds">"</span>wrap_content<span class="pl-pds">"</span></span> 
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_multiline</span>=<span class="pl-s"><span class="pl-pds">"</span>false<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_hint</span>=<span class="pl-s"><span class="pl-pds">"</span>hint<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_enableFloatingLabel</span>=<span class="pl-s"><span class="pl-pds">"</span>false<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_enableErrorLabel</span>=<span class="pl-s"><span class="pl-pds">"</span>false<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_floatingLabelText</span>=<span class="pl-s"><span class="pl-pds">"</span>floating label<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_baseColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/base<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_highlightColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/highlight<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_errorColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/error<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_typeface</span>=<span class="pl-s"><span class="pl-pds">"</span>typeface.ttf<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_thickness</span>=<span class="pl-s"><span class="pl-pds">"</span>2dp<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_hintColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/hint<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_arrowColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/arrow<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_arrowSize</span>=<span class="pl-s"><span class="pl-pds">"</span>16dp<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_alignLabels</span>=<span class="pl-s"><span class="pl-pds">"</span>false<span class="pl-pds">"</span></span>
        <span class="pl-e">app</span><span class="pl-e">:</span><span class="pl-e">ms_floatingLabelColor</span>=<span class="pl-s"><span class="pl-pds">"</span>@color/floating_label<span class="pl-pds">"</span></span>/&gt;</pre></div>

<p>You can set a hint and a floating label text. If no floating label text is provided, the hint will be set instead.</p>

<p>Java side, you use it like a regular spinner, setting an adapter to it.</p>

<div class="highlight highlight-source-java"><pre> <span class="pl-k">String</span>[] <span class="pl-c1">ITEMS</span> <span class="pl-k">=</span> {<span class="pl-s"><span class="pl-pds">"</span>Item 1<span class="pl-pds">"</span></span>, <span class="pl-s"><span class="pl-pds">"</span>Item 2<span class="pl-pds">"</span></span>, <span class="pl-s"><span class="pl-pds">"</span>Item 3<span class="pl-pds">"</span></span>, <span class="pl-s"><span class="pl-pds">"</span>Item 4<span class="pl-pds">"</span></span>, <span class="pl-s"><span class="pl-pds">"</span>Item 5<span class="pl-pds">"</span></span>, <span class="pl-s"><span class="pl-pds">"</span>Item 6<span class="pl-pds">"</span></span>};
 <span class="pl-k">ArrayAdapter&lt;<span class="pl-smi">String</span>&gt;</span> adapter <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">ArrayAdapter&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-v">this</span>, <span class="pl-smi">android<span class="pl-k">.</span>R</span><span class="pl-k">.</span>layout<span class="pl-k">.</span>simple_spinner_item, <span class="pl-c1">ITEMS</span>);
 adapter<span class="pl-k">.</span>setDropDownViewResource(<span class="pl-smi">android<span class="pl-k">.</span>R</span><span class="pl-k">.</span>layout<span class="pl-k">.</span>simple_spinner_dropdown_item);
 spinner <span class="pl-k">=</span> (<span class="pl-smi">MaterialSpinner</span>) findViewById(<span class="pl-smi">R</span><span class="pl-k">.</span>id<span class="pl-k">.</span>spinner);
 spinner<span class="pl-k">.</span>setAdapter(adapter);</pre></div>

<p>If you need to set an error message, you can do it the same way than with an EditText :</p>

<div class="highlight highlight-source-java"><pre> <span class="pl-c">//Activate</span>
 spinner<span class="pl-k">.</span>setError(<span class="pl-s"><span class="pl-pds">"</span>Error<span class="pl-pds">"</span></span>);
 <span class="pl-c">//Desactivate</span>
 spinner<span class="pl-k">.</span>setError(<span class="pl-c1">null</span>);</pre></div>

<p>You can choose to have a scrolling animation or to set the error message on multiple lines with the "ms_multiline" attribute in xml (default is true).</p>


</article>
