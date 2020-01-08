外观模式：
提供一个统一的接口用来访问子系统的一群接口。

例子：
构建家庭影院时，调用watchMovie时，还调用到了DVDPlayer CDPlayer等等。

当当的Elastic-job的JobScheduler中使用到外观模式
    private final SchedulerFacade schedulerFacade;
    private final JobFacade jobFacade;
    
schedulerFacade.registerStartUpInfo方法：
    public void registerStartUpInfo(boolean enabled) {
        this.listenerManager.startAllListeners();
        this.leaderService.electLeader();
        this.serverService.persistOnline(enabled);
        this.instanceService.persistOnline();
        this.shardingService.setReshardingFlag();
        this.monitorService.listen();
        …………
    }

重点：
与适配器的区别在于使用的目的
外观的意图是简化接口 
而适配器的意图 是转换成不同的接口