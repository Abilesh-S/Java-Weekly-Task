package com.kovanlabs.intern.week.task.interfaceDay8;

interface Plugin{
    int execute();
}
class SquarePlugin implements Plugin{
    int value;
    SquarePlugin(int value){
        this.value = value;
    }
    @Override
    public int execute() {
        return value*value;
    }
}

class CubePlugin implements Plugin{
    int value;
    CubePlugin(int value){
        this.value = value;
    }
    @Override
    public int execute() {
        return value*value*value;
    }
}

class CoreSystem {
    public static void main(String[] args) {
        Plugin anonymousInnerClass = new Plugin(){
            @Override
            public int execute() {
                return 5;
            }
        };
        Plugin[] plugins = new Plugin[5];
        plugins[0] = new SquarePlugin(1);
        plugins[1] = new CubePlugin(2);
        plugins[2] = new CubePlugin(3);
        plugins[3] = new SquarePlugin(4);
        plugins[4] = anonymousInnerClass;

        int sum = 0;
        for (Plugin plugin : plugins) {
            sum = sum + plugin.execute();;
        }
        System.out.println("Total Plugins "+sum);
    }
}