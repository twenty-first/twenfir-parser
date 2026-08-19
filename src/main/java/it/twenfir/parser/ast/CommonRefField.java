package it.twenfir.parser.ast;

import it.twenfir.antlr.ast.AstNode;
import it.twenfir.antlr.ast.Location;

public abstract class CommonRefField extends AstNode {

	private String name;
	private String library;
	private String file;

	public CommonRefField(Location location, String name, String library, String file) {
		super(location);
		this.name = name;
		this.library = library;
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setLibrary(String library) {
		this.library = library;
	}
	
	public String getLibrary() {
		return library;
	}

	public void setFile(String file) {
		this.file = file;
	}
	
	public String getFile() {
		return file;
	}

}
