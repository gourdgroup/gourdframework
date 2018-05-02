# Git开发流程指南

## 1 准备工作

>- 新建自己的gitHub账号，加入项目团队
>- 添加自己的SSH公钥到团队账号的SSH列表，标题取易识别的名称
>- 克隆项目到本地（推荐ssh方式）

    命令：git clone 项目ssh地址
    注意：使用idea，需将IDE配置中Git的SSH executable改为Native
    
## 2 分支管理    

### 创建分支

当你需要开发一个功能时，请从develop分支处开一个分支，开发并测试完成后，及时提交至git，然后登陆gitHub申请合并分支到develop分支。

>注意：
>- 分支命名规则：特性分支（feature_分支概要） 修复分支（hotfix_分支概要）
>- 特性分支一般从develop开，修复分支如需推送到master可从master分支开
>- 开分支前请先pull develop分支到最新状态
>- 不同的功能请开不同的特性分支
>- 请勿merge别人的分支到自己的特性分支（merge回develop和代码审查会出问题）
>- 分支合并进develop分支后，请及时删除远程和本地的相关分支，并pull develop分支到最新状态

    技巧：同时维护多个分支
    如当前处于某分支，此时需紧急处理某个bug。可将当前分支先存到stash，待紧急处理结束再拉取stash的分支
    存入stash：git stash save '分支名称'
    取出stash：git stash pop --index 0
    查看stash: git stash list

### 新建分支合并到develop分支

在合并develop分支前，需进行code review，当review通过后，合并到develop分支

### develop分支推送到master

当某一阶段功能完全开发完成，可推送develop分支到master分支，并打上tag标签

> 推送master须知：
>- 禁止推送特性分支到master，master只接受必要的修复
