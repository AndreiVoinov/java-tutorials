package gia.utils;

public enum CommandLineInput {
	
	EXIT('e');

	private char shortCmd;
	
	private CommandLineInput(char shortCmd) {
		this.shortCmd = shortCmd;
	}
	
	public static CommandLineInput getCommandLineInputForInput(char command) {
		for(CommandLineInput val : values()) {
			if(val.getShortCmd() == command) {
				return val;
			}
		}
		return null;
	}

	public char getShortCmd() {
		return shortCmd;
	}
}
