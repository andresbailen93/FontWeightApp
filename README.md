# FontWightApp

This is an example App to show how to work with font weight, instead of android textStyle:

````
<TextView
android:textStyle="bold|italic|normal"
...
````

In this case, our goal is to use the device's default font, but with more advanced customization than `textStyle`.

Then we can achive the bold, semibold, medium, regular, light, thin, etc. fonts to use in our apps.

We have to use the attributtes:

````
<item name="android:textFontWeight" tools:targetApi="p">300</item>
<item name="fontFamily">@font/font</item>
````

 ## Why?

We can use a custom font instead of system font. But sometimes we want the user to find a typography in which they feel comfortable.

![app preview](https://miro.medium.com/max/1400/1*_Dg5A5C4d0FYHijKM_xjpQ.png "App Preview")
https://miro.medium.com/max/1400/1*_Dg5A5C4d0FYHijKM_xjpQ.png
