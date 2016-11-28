# DfireDemo
组件化开发demo

1、主业务app、子业务A、子业务B、公共组件base

2、修改各业务module目录下gradle.properties文件的isDebug属性值来区分release/debug版本，当子业务的isDebug = true时，相应的module可以单独跑起来（修改之后需要sync）。

3、公共组件base模块放了一个简单的schema路由器，可以将其他的一些公共组件放在这个模块，比如资源文件等。

