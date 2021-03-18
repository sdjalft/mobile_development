# 对于flutter的探究

&nbsp;&nbsp;&nbsp;&nbsp;flutter，乃是由谷歌研发的一个开源的跨平台的框架。最新推出的flutter2（就是前几天）甚至增添了web端的支持。本人有幸在之前参与过flutter项目的开发，所以这里除了说一下flutter内容上的探究，还会夹带些私货，谈论下自己对于flutter的理解。

## 什么是flutter

先看下官方的说法：

>Flutter is Google’s UI toolkit for building beautiful, natively compiled applications for mobile, web, and desktop from a single codebase. 

由此看出，flutter支持多个平台，像是移动端、web端，甚至是桌面应用。一份代码，多个平台，这可以大大提高开发者的工作效率。通过一个实际的flutter项目我们可以发现，在flutter run的时候产生了.android和.ios文件夹，我猜这就是跨平台的原理：一份源代码通过不同的方式编译到各个平台上。

## flutter的优势

&nbsp;&nbsp;&nbsp;&nbsp;flutter最大的优势肯定是跨平台，这个上面说过所以不再过多赘述。还有一个非常舒服的地方就是，flutter支持热更新、热重载。什么是热更新呢？这就相当于我们在第一次编译我们的flutter源码后，如果只是修改一些外观方面的东西的话，无需重新构建，通过“热更新”的方式直接将修改后的ui外观展现在运行设备上。热重载的话就是在热更新的基础上清除各种缓存。

&nbsp;&nbsp;&nbsp;&nbsp;编译完成后，只需在控制台区域按“r”即可热更新，按“R”即可热重载。然而热更新方面似乎并不太成熟，总是会出很多莫名其妙的bug需要重新构建才能解决。比如如果在flutter中存在一个视频流，如果不将其进行停止后直接热重载，那么这个视频流并不会停止。

## flutter开发方面

&nbsp;&nbsp;&nbsp;&nbsp;flutter使用的是dart语言，是js系的语言。至于为什么使用dart语言，我自己是没有分析出来的，于是查看了一些解答,最终得出结论：dart开发者生产效率高，面向对象，可预期 高性能，快速内存分配。

&nbsp;&nbsp;&nbsp;&nbsp;个人感觉，dart的开发模式对后端转前端的人来说很友好。与传统的html，css这种语系相比，flutter采用的方法是将前端“组件化”，将页面的每一部分封装成一个个“widget”，然后通过嵌套装饰组件的方式来对这些widget进行诸如定位、缩放、逻辑等处理。这对于习惯了面向对象开发的后端开发者来说非常友好，不用更改自己的设计思路，因为flutter作为一个前端框架也是面向对象的。

## flutter的其他方面

&nbsp;&nbsp;&nbsp;&nbsp;flutter一经推出就受到了广大开发者的追捧。flutter优秀的生态催生除了很多优秀的第三方库，像fluttertoast消息提示库、dio网络库、pull_to_refresh刷新库等。但是目前，flutter仍存在很多的问题，刚开始学习flutter时glithub的issue数量就有5000+，现在再看还是有5000+，甚至形成了动态平衡。自己开发的时候也经常被flutter各种特殊的机制搞到头大。第三方包也随着gradle构建版本的更新而产生很多的问题。

&nbsp;&nbsp;&nbsp;&nbsp;总而言之，flutter作为一个新生的框架，已经接近成熟了。（bug修一修啊。。。）最新推出的flutter2也证明了这个开源框架的成功和活力。我相信flutter在将来必定会成为移动开发者的主流框架选择！