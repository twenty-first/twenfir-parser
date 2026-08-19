package it.twenfir.parser.ast;

import it.twenfir.antlr.ast.AstNode;
import it.twenfir.antlr.ast.Location;

public abstract class CommonRef extends AstNode {

	private String library;
	private String reference;

	public CommonRef(Location location, String library, String reference) {
		super(location);
		this.library = library;
		this.reference = reference;
	}

	public String getLibrary() {
		return library;
	}

	public String getReference() {
		return reference;
	}

}
