# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# ssm632儿童影楼拍摄管理系统的设计与实现+vue

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Tm8QeZE4a?p=31)


# 第1章 绪论
## 1.1研究背景
近年来，第三产业发展非常迅速，诸如计算机服务、旅游、娱乐、体育等服务行业，对整个社会的经济建设起到了极大地促进作用，这一点是毋庸置疑的。现下，国家也出台了一些列的政策来支持和鼓励第三服务产业的发展与完善，用以带动社会经济的发展[1]。所以，整体来说，国家是比较提倡发展第三方服务行业的。纵观计算机领域的整个发展历程，从计算机的诞生到现在，已经有几百年的历史了，计算机应用技术也逐步趋于成熟，并且相关的设计人员也在不断地对其进行改进和完善。再到如今，计算机已经发展成为一个比较热门的行业了。在高校中，计算机、人工智能等专业热度非常高，许多学生在选择专业的时候，大都优先考虑计算机专业。在社会上，计算机类行业也成为了比较受欢迎的行业，从在浏览器中访问的网址，到手机上的各种应用程序，到大型的软件服务设备，基本上都离不开计算机技术支持，以及硬件的支撑。

如今，互联网几乎遍布于世界的各个角落，人工智能、大数据占据的越来越重要的社会地位，比如疫情期间，通过大数据技术进行筛查，确定哪些人员无接触史，哪些人员需要重点观察，由此可以在极短的时间内，以最快的速度对疫情进行防控。在这个大背景环境的推动下，本人通过学习Java语言、MySQL数据库、SSM框架等相关的计算机技术，打好坚实的技术基础，方便后期对系统进行研发。而后再通过对系统进行分析,确定系统的总体功能需求，以及实现的可能性，方便接下来详细地设计相关的功能模块，最后成功的研发了一款基于SSM的儿童影楼拍摄管理系统。本系统改善了传统的管理模式，将原先的手工记录和管理信息，改进为使用计算机存储和管理信息记录，极大地方便了工作人员对相关数据进行处理，为相关行业节约了不少的员工费用和管理开销，并且能够在较短的时间内响应用户的需求，这种便捷的操作，对于用户来说可以节省了不少时间和精力，也省去了不少的麻烦，极大了方便了用户。
## 1.2研究意义
传统的信息管理模式，主要是以人力为主进行管理和控制，由工作人员负责登记用户信息，再通过对照之前的信息记录，确定是否给用户提供相关的使用需求，以及如何提供能让用户满意的使用需求。这种管理模式已经适应不了时代的变化了，正在不断地走下坡路，并且逐步被信息化管理模式所取代。所谓的信息化管理模式，是现在主流的一种管理模式，其通过与计算机技术相结合的方式，对行业的整个工作模式和服务流程进行改进和完善。其主要通过使用计算机等设备，将工作服务流程电子化，并且进行存储记录，用以提高行业整体的服务水平。结合使用计算机技术，本人研发出一款基于SSM的儿童影楼拍摄管理系统，采用电子化的方式对数据信息进行存储，便于工作人员对相关信息进行记录和管理，有利于提高相关行业的工作运营效率以及工作人员的管理速度，以此更好的满足用户的相关需求，最终达到提升用户的使用感受的目的，由此可见设计和实现本系统具有重要的意义和价值。
## 1.3国内外研究现状
### 1.3.1国外研究现状
美国是最先发展计算机技术的众多国家之一，早在上个世纪，美国就快速的将计算机技术发展起来，并且将其运用在军事、医院、学校、社会服务等场所。日本、德国等国家紧随其后，不断地发展和完善计算机技术，侧重将医疗、社会服务等领域与计算机技术相结合[2]。而后随着社会的发展与进步，计算机技术逐渐趋于成熟。许多发达国家在探索将计算机技术应用于各行各业中时，从另一个角度来看，也在不断地推进相关行业的信息化管理进程，使得相关行业管理也变得更加网络化、信息化了。有许多专家表示，可以结合使用图像处理软件、人工智能技术等相关工具，深度地分析儿童影楼拍摄管理系统，主要从简化运行操作，加设功能模块，美化系统界面，保障数据安全等方面，更深层次地提升和优化系统，并且尽可能地在理想状态下做到实时的信息共享。
### 1.3.2国内研究现状
国内的计算机技术的发展虽然晚于国外，尤其是美国、英国、德国等发达国家。但是我国的计算机技术发展势头非常迅猛，近些年，也逐渐走向成熟和完善的阶段。现在，选择网上购物已经成为人们日常生活的一种常态趋势，当然这也离不开对于天猫、支付宝、微信等应用软件的使用[3]。许多企业结合使用了云计算、人工智能等先进的计算机技术，自主研发了行业相关的信息管理系统，计算机技术逐渐趋于成熟，使用设计的功能逐渐趋于完备。结合计算机技术，采用主流的B/S开发结构模式开发一款基于SSM的儿童影楼拍摄管理系统。由此，本系统能够支持工作人员随时随地的通过使用浏览器进行访问操作，支持随时随地对相关的儿童影楼拍摄信息进行管理，便于及时为用户提供一定的功能服务。并且所设计的系统基本上能够符合用户的客观使用需求，有利于充分协调相关行业的人力、财力、物力等资源，不断提高相关工作人员的管理质量和水平[4]。
## 1.4研究内容与方法
### 1.4.1研究内容
本文首先介绍了儿童影楼拍摄管理系统的研究背景与意义，其次介绍了系统的总体功能设计，接着将对系统规划好的总体功能拆分成了各个功能子模块，然后详细地对每一个小的功能子模块进行设计，最后介绍了展示设计好的功能模块以及测试结果。系统主要分为管理员角色和用户角色，具体的功能设计包括注册登录管理、用户信息管理、商品信息管理、服装饰品管理等模块。注册登录管理功能是新用户在使用系统前，需要通过注册步骤，登记详细的信息资料，而后再通过输入正确的账号和密码，成功登录系统后，即可通过一系列的操作来满足自己的相关需求。用户信息管理功能是管理相关的用户信息资料，管理人员根据现实情况的需要，选择性的对用户信息记录进行更新处理。商品信息管理是管理相关的商品信息记录，保存详情的商品信息情况，方便及时响应用户的服务请求。服装饰品管理是管理相关的服装饰品信息记录，方便相关人员及时查看服装饰品信息，如果遇到异常的服装饰品信息，可以及时对其进行处理，在较短的时间内解决问题，提高用户的使用体验。
### 1.4.2研究方法
本系统以B/S结构进行实现，通过使用idea工具编写相关的java代码，设计系统功能模块，再通过MySQL数据库管控数据资源，由此有利于对系统相关数据进行必要的管理和控制。系统设计的最关键的环节，则是需要通过SSM框架设计系统功能架构，再通过Tomcat服务器将系统发布到浏览器上，以便相关用户的操作和使用。本系统的设计和实现促进了相关行业的信息化建设，有利于简化相关人员工作流程，提高工作效率，提升工作幸福感。
## 1.5论文的组织结构
基于SSM的儿童影楼拍摄管理系统的设计与实现的论文组织安排，大致可以被分为七个章节，具体的内容如下：

第一章为绪论，本章主要介绍了系统的背景、现状、方法等内容。根据研究背景与意义，介绍所要设计的系统的研究背景和理论依据，再通过国内外研究现状，了解当前相关的系统软件产品的实际研究情况，最后通过研究内容与方法，总体概括系统的整个开发流程和实现步骤，为系统提供可靠的理论依据和技术支持。

第二章为相关技术介绍，本章主要介绍了开发所使用的相关技术。本系统主要使用的开发技术包括Java语言、SSM框架、MySQL数据库等，并且所使用的开发模式为B/S结构。其中，Java语言具有跨平台性，可移植性高，可以支持在不同的浏览器上运行本系统，MySQL数据库占用内存少，执行速度快，对于中小型系统的数据管理是非常好的选择。

第三章为系统分析，系统分析阶段主要是对系统进行需求和可行性分析，规划系统的功能设计，判断系统实现的可能性。根据需求分析，确认使用者对系统的基本功能需求，再通过在经济、操作、法律上进行可行性分析，分析系统研发的实际意义和使用价值，系统性能的稳定性和功能操作的便捷性，以及成功投入市场的可能性。

第四章为系统设计，系统设计阶段主要是对系统进行总体功能和数据库设计。通过介绍系统的总体功能设计，总体规划系统的功能模块，为系统的基本功能实现提供参考依据和设计思路。再通过介绍数据库设计，设计相关的数据二维表格存放和管理与系统有关的数据信息，便于相关人员管理与系统有关的数据信息，维护和更新数据信息的安全。

第五章为系统实现，系统实现阶段主要是对商品信息管理、服装饰品管理等功能模块进行阐述。通过前面介绍的系统分析，功能及数据库设计等相关内容，详细地实现系统功能模块。系统的具体实现步骤，就是对各子模块详细设计的过程，在整个系统设计过程中，这一阶段是极为重要，直接关系到用户对系统的使用感受。

第六章为系统测试，本章主要是对测试相关的内容进行叙述。本系统主要使用功能测试的方法，检查测验系统主要功能，测试所设计的系统功能模块能否正常打开，并且用户能够正常操作和使用，在系统运行过程中是否发生异常，如运行异常、数据异常、结果异常等，并且根据测试结果，给出相应的测试总结，由此得出相关结论，说明系统是否达到预期要求、设计目的。


# 第2章 开发技术介绍
## 2.1 B/S结构
就软件开发的现状而言，目前主要使用的系统开发结构模式大致可以分为C/S模式和B/S模式[5]。用户在使用基于C/S模式开发的系统时，必须下载相应的客户端，即应用程序，才能操作和使用软件系统的相关功能模块。从使用者的角度来看，由于下载和安装客户端的步骤比较繁琐，期间还需要确保下载网速的稳定性，以及安装步骤的正确性，进而增加了用户放弃使用该系统的可能性，由此可见C/S模式具有很大的局限性。

由于C/S模式适用于小范围的局域网，并且具有一定的通信效率，所以在以前系统规模很小的时代，主要使用C/S模式对系统开发。随着时代地发展以及社会地进步，C/S模式也越来越满足不了开发者的设计需要，以及使用者的使用需求[6]。当下，C/S模式已经满足不了实际的系统程序设计要求，由此，B/S模式以C/S模式为基础而被提出，并且在近些年逐渐发展成为主流的开发结构模式。在B/S模式下开发的系统，不再需要用户下载和安装相应的应用程序，直接通过使用浏览器，输入正确的网站地址，以访问网站的形式实现系统的相关功能操作，这一特点对C/S模式下的开发设计做出了极大地改进，当然，使用本系统的前提是确保账号和密码是合法的。
## 2.2 Java语言
Java语言是一种将数据和操作方法封装成对象整体的程序设计语言，它拥有着优秀的技术体系结构。目前在市场上，很大一部分的应用系统主要使用Java语言进行开发[7]。Java语言具有简单易懂，操作方便，健壮性强等优点，开发人员能够的在短时间内理解和掌握Java语言，并将其运用到具体的系统开发过程中学。针对于系统内存管理问题，Java语言为解决这类问题，内部提供了垃圾回收机制。为了极大地简化了开发编程的难易程度，Java语言还将C语言中的指针，改进成了引用，所以受到了很多开发人员的喜爱。Java语言还具有跨平台性的特点，意味着它的可移植性非常高，这一特点有利于开发人员更新和维护相关代码，由它所开发的系统可以支持在不同的浏览器中打开。因为使用Java开发的系统兼容性较强，代码通用性较高，为了后期方便对系统进行完善和维护，所以本人最终选择使用Java语言开发本系统。
## 2.3 SSM框架
SSM框架主要由Spring、SpringMVC、MyBatis这三个框架所集成的，是现在比较流行的一种Java开发框架，能够适用于大中型的应用程序的设计和搭建。Spring是前几十年前兴起的一种轻量级的、开源的Java开发框架，使用它可以解决相关的系统对象创建和对象依赖问题，并且也可以将高耦合的系统分解为低耦合的多个功能模块，方便对系统模块进行明确的分工，对功能代码进行理解和修改，这就极大地减轻了设计人员的开发压力[8]。SpringMVC框架是基于Spring框架而被提出的，它以MVC三层架构为核心，对Spring的相关技术进行了整合，主要针对于Web端进行技术架构，通过对相关的请求处理进行细化处理，对相关的用户请求做出一定的响应处理。MyBatis框架是一种开源的Java持久层框架，它主要是通过改进手动设置参数和获取结果记录的方式，通过支持对数据库进行存储过程、高级映射等处理，使得数据库的操作更加定制化、透明化，因此降低了数据库访问的复杂性，提高了开发的工作效率。
## 2.4 MySQL数据库
MySQL数据库是一种使用频繁的关系型数据库。因为其具有开源免费、占用内存少、安装简单、操作便捷、使用灵活等优点，所以经常被运用于中小型的系统开发中[9]。MySQL数据库可以支持多线程，在同一个时间内，能够同时响应多个用户的使用需求。MySQL数据库还自带了优化器，方便设计人员在 使用过程中，快速的查询相关的数据信息。除此之外，SQLServer数据库在当下也是使用比较频繁的，它在数据安全、系统稳定等方面还是比有所保障，但是由于其收费使用、占用内存大、操作复杂、维护成本高， 一般适用于中型及以上的系统开发中。MySQL数据库也有着许多的应用程序接口，以供相关的编程语言使用，编写的代码具有极高的通用性和维护性，并且MySQL数据库能够迅速的处理上千条数据记录，在系统故发生障时，能通过日志文件快速恢复。MySQL数据库与SQLServer数据库相比较，综合考虑成本开销、占存大小、代码通用、数据维护、操作难易程度等方面，MySQL数据库占有很大的优势，在数据库设计人员的眼中，MySQL数据库的实际运用价值极高。


# 第3章 系统分析
## 3.1系统的需求分析
需求分析阶段是设计系统功能模块的总方向，可以这样来说，系统的整个的开发流程以及设计进度，基本上都是以需求分析为基本依据的[10]。需求分析阶段可以确定系统的基本功能设计，以及在最后的系统验收阶段，再通过对需求分析报告进行对比，验证系统的功能设计是否合理，能否满足用户的基本需要，最终判断总结系统是否成功现实。本文主要通过问卷调查的方式，来分析儿童影楼拍摄管理系统所需要的相关功能[11]。根据调查结果显示，系统用户主要有两种类型，一种是以使用为主要目的的用户角色类型，另一种是以管理为主要目的的管理员角色类型。本系统主要功能需求包括商品信息管理、服装饰品管理等模块。其中，密码信息、用户信息、商品信息、服装饰品信息等都是非常重要的数据记录，在系统设计的过程中，需要进行一定的加密处理，确保数据安全性，切实的保护好用户的重要信息。
## 3.2系统的可行性分析
### 3.2.1经济可行性
对系统进行经济可行性分析，也可以被称为对系统进行经济可行性研究，它是从社会的经济发展出发，通过研究整个的系统可行性，对成本收益情况进行全面地、具体地分析，并且根据所分析的可行性报告，为相关的投资者提供最科学的决策理论和最优的投资方案。本系统的开发促进了相关行业的信息化管理，管理人员可以直接通过在浏览器上发布儿童影楼拍摄管理系统的网站地址，即可用户根据一定的需要，有选择的对系统相关功能进行操作。这种方式打破了时间和空间的限制，可以使得相关行业在较短的时间内最大化地管理儿童影楼拍摄的相关信息。并且本系统所使用的开发技术和相关工具，大部分是开源的、免费的，所以可以节约很大一笔开发成本。综合上述内容分析可知，本系统的实现在经济层面上是具备可行性的。
### 3.2.2技术可行性
本系统是基于Java语言而进行开发的，因为Java语言容易学习、使用简单、稳定性强等特点，所以许多的开发技术人员均喜欢使用Java语言进行系统设计。现今很多程序系统的研究和开发，是通过使用Java语言进行编码设计的。此外，Java语言还具有跨平台的优点，这意味着所设计的系统是与平台无关的，也就说明由Java语言开发的系统可以支持在不同的浏览器上运行和使用。在条件大致相同的情况下，对比其他数据库，本系统使用的是MySQL数据库的相关语法简单易懂，数据库设计人员可以尽可能快的对其掌握和使用。MySQL数据库还具有占用系统内存少、功能齐全、响应速度快、使用不收费等特点，能够在极短时间内处理上千条信息记录，所以能够保证系统可以高效地运行和工作。综合上述内容分析可知，系统的实现在技术层面上是具备可行性的。
### 3.2.3操作可行性
如今，人们的日常生活已经离不开互联网的使用，在一定程度上，相关行业的信息化建设促进着社会的发展。人们通过使用手机上的应用程序，比如，通过使用电子商务系统，可以实现网上购物、在线支付等功能；通过使用国家官方网站，可以查看最新消息，申报个人业务；通过使用医院管理系统，可以进行网上预约挂号，在线查看体检报告等操作。在这些应用的背景下，本系统使用的是B/S开发结构模式，网站界面以人性化的设计为主，具有美观友好、交互性好等优点，用户不需要掌握一定的编程技术，直接通过对系统进行简单的功能操作，即可满足自己的使用需求。本系统还设计了一些提示信息，便于用户更好的理解系统相关功能，较快的以正确的操作方式来使用系统。综合上述内容分析可知，系统的实现在操作层面上是具备可行性的。


# 第4章 系统设计
## 4.1系统的总体功能设计
系统的总体功能设计，是需求分析的下个阶段，是系统实现的上个阶段，它是系统详细功能设计的一个大方向，也就是说系统的各类子功能模块的设计，都是以总体功能设计为目标而进行的。通过对系统进行需求分析可知，可以大致了解系统具体所需要的相关的主要功能模块。本系统主要的功能需求包括商品信息管理、服装饰品管理等模块。系统总体功能设计图如图4-1所示。

儿童影楼拍摄管理系统

用户信息管理

拍摄预定管理

商品信息管理

服装饰品管理

基础数据管理

用户信息修改

用户信息新增

基础数据添加 

基础数据删除

基础数据修改

服装饰品添加

服装饰品修改

服装饰品删除

拍摄预定添加

拍摄预定删改

拍摄预定删除

商品信息添加 

商品信息修改 

商品信息删除 

公告信息管理

公告信息修改

公告信息删除

公告信息添加


![](/md/blog.002.png)

图4-1系统总体功能设计图

4.2数据库设计
### 4.2.1概念设计
本系统使用轻量级的MySQL数据库，对系统相关的数据信息进行管理和维护[12]。数据库设计阶段一般可以被分为概念设计和逻辑设计这两个阶段。在进行数据库相关设计的全过程中，两个阶段所起到作用是完全不同的，概念设计是实现数据库设计的主要基础，逻辑设计阶段是完成数据库设计的最终目标。概念设计阶段以设计实体-联系图（E-R图）的方式，将现实世界中用户的相关需求抽象化为虚拟世界中的概念模型。本人通过设计E-R图，详细地对系统各实体以及其存在的联系进行了表达。各实体信息的实体属性图如图4-2、图4-3、图4-4、图4-5、图4-6、图4-7、图4-8、图4-9、图4-10所示，系统总体E-R图如图4-11所示。

![](/md/blog.003.png)

图4-2管理员信息实体属性图

![](/md/blog.004.png)

图4-3职员信息实体属性图

![](/md/blog.005.png)

图4-4顾客信息实体属性图

![](/md/blog.006.png)

图4-5商品信息实体属性图

![](/md/blog.007.png)

图4-6字典信息实体属性图

![](/md/blog.008.png)

图4-7服装饰品信息实体属性图

![](/md/blog.009.png)

图4-8拍摄预定信息实体属性图

![](/md/blog.010.png)

图4-9拍摄选图信息实体属性图

![](/md/blog.011.png)

图4-10公告信息实体属性图

![](/md/blog.012.png)

图4-11系统总体E-R图
### 4.2.2逻辑设计
逻辑设计阶段主要的工作是将概念设计中的E-R图，转换成方便系统进行存储和管理的二维表格形式。这一阶段也可以被称为数据库的详细设计，其直接关系到系统功能模块的正常运行、数据信息的正常更新等[13]。在设计过程中，需要充分考虑数据库的规范性和合理性，使得能够满足系统的功能和性能需求。本系统相关的数据表格设计内容如下所示。

表4-1 管理员信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|用户名|是|
|3|password|String|密码|是|
|4|role|String|角色|是|
|5|addtime|Date|新增时间|是|

表4-2 职员信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|账户|是|
|3|password|String|密码|是|
|4|zhiyuan\_name|String|职员姓名|是|
|5|zhiyuan\_photo|String|头像|是|
|6|sex\_types|Integer|性别|是|
|7|zhiyuan\_phone|String|联系方式|是|
|8|zhiyuan\_id\_number|String|身份证号|是|
|9|zhiyuan\_email|String|邮箱|是|
|10|zhiyuan\_delete|Integer|假删|是|
|11|create\_time|Date|创建时间|是|

表4-3 顾客信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|username|String|账户|是|
|3|password|String|密码|是|
|4|yonghu\_name|String|顾客姓名|是|
|5|yonghu\_photo|String|头像|是|
|6|sex\_types|Integer|性别|是|
|7|yonghu\_phone|String|联系方式|是|
|8|yonghu\_id\_number|String|身份证号|是|
|9|yonghu\_email|String|邮箱|是|
|10|<p>yonghushenfen\_</p><p>types</p>|Integer|身份|是|
|11|yonghu\_delete|Integer|假删|是|
|12|create\_time|Date|创建时间|是|

表4-4 商品信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|shangpin\_uuid\_number|String|商品编号|是|
|3|shangpin\_name|String|商品名称|是|
|4|shangpin\_photo|String|商品照片|是|
|5|shangpin\_types|Integer|套餐类型|是|
|6|shangpin\_kucun\_number|Integer|商品库存|是|
|7|shangpin\_new\_money|BigDecimal|现价|是|
|8|shangpin\_content|String|商品介绍|是|
|9|create\_time|Date|创建时间|是|

表4-5 字典信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|dic\_code|String|字段|是|
|3|dic\_name|String|字段名|是|
|4|code\_index|Integer|编码|是|
|5|index\_name|String|编码名字|是|
|6|super\_id|Integer|父字段编号|是|
|7|beizhu|String|备注|是|
|8|create\_time|Date|创建时间|是|

表4-6 服装饰品信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|fuzhuangshipin\_uuid\_number|String|服装编号|是|
|3|<p>fuzhuangshipin\_</p><p>name</p>|String|服装名称|是|
|4|<p>fuzhuangshipin\_</p><p>photo</p>|String|服装照片|是|
|5|fuzhuangshipin\_types|Integer|服装类型|是|
|6|fuzhuangshipin\_new\_money|BigDecimal|现价|是|
|7|fuzhuangshipin\_content|String|服装介绍|是|
|8|create\_time|Date|创建时间|是|

表4-7 拍摄预定信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|paisheyuding\_order\_uuid\_number|String|订单号|是|
|3|paishexiangmu\_types|Integer|拍摄项目|是|
|4|paisheyuding\_time|date|预约时间|是|
|5|paishexiangmu\_number|BigDecimal|定金|是|
|6|paisheyuding\_order\_types|Integer|订单类型|是|
|7|yonghu\_id|Integer|用户|是|
|8|insert\_time|Date|发布时间|是|
|9|create\_time|Date|创建时间|是|

表4-8 拍摄选图信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|paishexiangmu\_id|Integer|拍摄预定|是|
|3|paishexuantu\_photo|String|图片|是|
|4|paishexuantu\_types|Integer|状态|是|
|5|insert\_time|Date|发布时间|是|
|6|create\_time|Date|创建时间|是|

表4-9 公告信息表

|序号|列名|数据类型|说明|允许空|
| :-: | :-: | :-: | :-: | :-: |
|1|id|Int|编号|否|
|2|news\_name|String|公告标题|是|
|3|news\_types|Integer|公告类型|是|
|4|news\_photo|String|公告图片|是|
|5|insert\_time|Date|公告时间|是|
|6|news\_content|String|公告详情|是|
|7|create\_time|Date|创建时间|是|




# 第5章 系统实现
## 5.1管理员角色功能设计
### 5.1.1个人中心
通过设计的个人中心功能模块，用户可以选择修改账号密码，查看个人资料信息，通过不定期的对个人账户密码进行更新，保障个人信息安全，修改密码界面设计如图5-1所示，个人信息界面设计如图5-2所示。

![](/md/blog.013.png)

图5-1修改密码界面

![](/md/blog.014.png)

图5-2个人信息界面
### 5.1.2管理员管理
通过设计的管理员管理功能模块，管理用户可以管理相关的管理员用户信息资料，比如进行查看管理员的详细资料，修改管理员的密码信息，删除已经注销的管理员信息记录等操作，管理员管理界面设计如图5-3所示。

![](/md/blog.015.png)

图5-3管理员管理界面
### 5.1.3基础数据管理
通过设计的基础数据管理功能模块，管理用户可以管理相关的服装类型、公告类型、拍摄项目、套餐类型信息记录，比如进行查看服装类型、公告类型、拍摄项目、套餐类型的详细信息，修改服装类型、公告类型、拍摄项目、套餐类型的名称信息，删除已经失效的服装类型、公告类型、拍摄项目、套餐类型信息记录等操作，服装类型管理界面设计如图5-4所示，公告类型管理界面设计如图5-5所示，拍摄项目管理界面设计如图5-6所示，套餐类型管理界面设计如图5-7所示。

![](/md/blog.016.png)

图5-4服装类型管理界面

![](/md/blog.017.png)

图5-5公告类型管理界面

![](/md/blog.018.png)

图5-6拍摄项目管理界面

![](/md/blog.019.png)

图5-7套餐类型管理界面
### 5.1.4服装饰品管理
通过设计的服装饰品管理功能模块，管理用户可以管理相关的服装饰品信息记录，比如进行查看服装饰品的详细信息，修改服装饰品的名称信息，删除已经失效的服装饰品信息记录等操作，服装饰品管理界面设计如图5-8所示。

![](/md/blog.020.png)

图5-8服装饰品管理界面
### 5.1.5公告信息管理
通过设计的公告信息管理功能模块，管理用户可以管理相关的公告信息记录，比如进行查看公告的详细信息，修改公告的标题信息，删除已经失效的公告信息记录等操作，公告信息管理界面设计如图5-9所示。

![](/md/blog.021.png)

图5-9公告信息管理界面
### 5.1.6拍摄预定管理
通过设计的拍摄预定管理功能模块，管理用户可以管理相关的拍摄预定信息记录，比如进行查看拍摄预定的详细信息，修改拍摄预定的时间信息，删除已经失效的拍摄预定信息记录等操作，拍摄预定管理界面设计如图5-10所示。

![](/md/blog.022.png)

图5-10拍摄预定管理界面
### 5.1.7商品管理
通过设计的商品管理功能模块，管理用户可以管理相关的商品信息记录，比如进行查看商品的详细信息，修改商品的图片信息，删除已经失效的商品信息记录等操作，商品管理界面设计如图5-11所示。

![](/md/blog.023.png)

图5-11商品管理界面
### 5.1.8顾客管理
通过设计的顾客管理功能模块，管理用户可以管理相关的顾客信息资料，比如进行查看顾客的详细资料，修改顾客的联系方式，删除已经注销的顾客信息记录等操作，顾客管理界面设计如图5-12所示。

![](/md/blog.024.png)

图5-12顾客管理界面
### 5.1.9职员管理
通过设计的职员管理功能模块，管理用户可以管理相关的职员信息资料，比如进行查看职员的详细资料，修改职员的联系方式，删除已经注销的职员信息记录等操作，职员管理界面设计如图5-13所示。

![](/md/blog.025.png)

图5-13职员管理界面
## 5.2职员角色功能设计
### 5.2.1个人中心
通过设计的个人中心功能模块，职员用户可以查看个人相关的信息资料，比如职员姓名、头像、联系方式、身份证号、邮箱等；也可以通过选择更新个人信息资料，需要注意的是，需要输入正确的字符格式，才能成功更新个人资料信息记录，也可以选择修改个人密码信息，保障个人账户安全，修改密码界面设计如图5-14所示，个人信息界面设计如图5-15所示。

![](/md/blog.026.png)

图5-14修改密码界面

![](/md/blog.027.png)

图5-15个人信息界面
### 5.2.2服装饰品管理
通过设计服装饰品管理功能模块，职员用户可以管理相关的服装饰品信息记录，可以选择查看服装饰品的详情信息，比如查看服装编号、服装名称、服装图片、服装类型、现价等信息，可以选择修改服装饰品相关的信息记录，服装饰品管理界面设计如图5-16所示。

![](/md/blog.028.png)

图5-16服装饰品管理界面
### 5.2.3公告信息管理
通过设计公告信息管理功能模块，职员用户可以管理相关的公告信息记录，可以选择查看公告的详情信息，比如查看公告标题、公告类型、公告图片、公告时间等信息，公告信息管理界面设计如图5-17所示。

![](/md/blog.029.png)

图5-17公告信息管理界面
### 5.2.4拍摄预定管理
通过设计拍摄预定管理功能模块，职员用户可以管理相关的拍摄预定信息记录，可以选择查看拍摄预定的详情信息，比如查看顾客姓名、头像、联系方式、订单号、拍摄项目、预约时间、定金等信息，可以选择添加拍摄的图片，也可以选择查看个人相关的图片信息，拍摄预定管理界面设计如图5-18所示。

![](/md/blog.030.png)

图5-18拍摄预定管理界面
### 5.2.5商品管理
通过设计商品管理功能模块，职员用户可以管理相关的商品信息记录，可以选择查看商品的详情信息，比如查看商品编号、商品名称、商品照片、套餐类型、商品库存、现价等信息，可以选择修改商品相关的信息记录，也可以根据实际情况，选择增加或者减少相关的商品库存数量，商品管理界面设计如图5-19所示。

![](/md/blog.031.png)

图5-19商品管理界面
### 5.2.6顾客管理
通过设计顾客管理功能模块，职员用户可以管理相关的顾客信息记录，可以选择查看顾客的详情资料，比如查看账户、顾客姓名、头像、性别、联系方式、身份证号、邮箱等信息，顾客管理界面设计如图5-20所示。

![](/md/blog.032.png)

图5-20顾客管理界面
## 5.3顾客角色功能设计
### 5.3.1个人中心
通过设计的个人中心功能模块，顾客用户可以查看个人相关的信息资料，比如顾客姓名、头像、联系方式、身份证号、身份、邮箱等；也可以通过选择更新个人信息资料，需要注意的是，需要输入正确的字符格式，才能成功更新个人资料信息记录；也可以选择修改个人密码信息，保障个人账户安全，修改密码界面设计如图5-21所示，个人信息界面设计如图5-22所示。

![](/md/blog.033.png)

图5-21修改密码界面

![](/md/blog.034.png)

图5-22个人信息界面
### 5.3.2服装饰品管理
通过设计服装饰品管理功能模块，顾客用户可以管理相关的服装饰品信息记录，可以选择查看服装饰品的详情信息，比如查看服装编号、服装名称、服装图片、服装类型、现价等信息，服装饰品管理界面设计如图5-23所示。

![](/md/blog.035.png)

图5-23服装饰品管理界面
### 5.3.3公告信息管理
通过设计公告信息管理功能模块，顾客用户可以管理相关的公告信息记录，可以选择查看公告的详情信息，比如查看公告标题、公告类型、公告图片、公告时间等信息，公告信息管理界面设计如图5-24所示。

![](/md/blog.036.png)

图5-24公告信息管理界面
### 5.3.4拍摄预定管理
通过设计拍摄预定管理功能模块，顾客用户可以管理相关的拍摄预定信息记录，可以选择查看拍摄预定的详情信息，比如查看顾客姓名、头像、联系方式、订单号、拍摄项目、预约时间、定金等信息，可以选择删除失效的预约拍摄信息记录，也可以选择查看个人相关的图片信息，拍摄预定管理界面设计如图5-25所示。

![](/md/blog.037.png)

图5-25拍摄预定管理界面
### 5.3.5商品管理
通过设计商品管理功能模块，顾客用户可以管理相关的商品信息记录，可以选择查看商品的详情信息，比如查看商品编号、商品名称、商品照片、套餐类型、商品库存、现价等信息，商品管理界面设计如图5-26所示。

![](/md/blog.038.png)

图5-26商品管理界面





















