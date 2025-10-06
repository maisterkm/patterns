package bihavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;

//invoker - carries a reference to a Command object
public class Switcher {

    private List<Command> commands = new ArrayList<>();

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for(Command command : this.commands)
            command.execute();
    }

}
