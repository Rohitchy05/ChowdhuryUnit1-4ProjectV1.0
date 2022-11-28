public abstract class Commands {
    public static final Commands NORTH = new Commands("NORTH");
    public static final Commands SOUTH = new Commands("SOUTH");
    public static final Commands EAST = new Commands("EAST");
    public static final Commands WEST = new Commands("WEST");

    public static final Commands IN = new Commands("IN");
    public static final Commands OUT = new Commands("OUT");

    public static final Commands UP = new Commands("UP");
    public static final Commands DOWN = new Commands("DOWN");

    public static final Commands TAKE = new Commands("TAKE");
    public static final Commands DROP = new Commands("DROP");

    public static final Commands HELP = new Commands("HELP");

    public static final Commands LOOK = new Commands("LOOK");

    public static final Commands INVENTORY = new Commands("INVENTORY");

    public abstract void execute(Adventure game, Adventure object);
}

class TakeCommand extends Commands {
    public void execute(Adventure game, AdventureObject obj) {
        game.executeTakeCommand();
    }
}

class DropCommand extends Commands {
    public void execute(Adventure game, AdventureObject obj) {
        game.executeTakeCommand();
    }
}

class HelpCommand extends Commands {
    public void execute(Adventure game, AdventureObject obj) {
        game.executeHelpCommand();
    }
}

class QuitCommand extends Commands {
    public void execute(Adventure game, AdventureObject obj) {
        game.executeLookCommand();
    }
}

