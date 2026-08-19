package it.twenfir.parser.ast;

import it.twenfir.antlr.ast.AstNode;
import it.twenfir.antlr.ast.Location;

public abstract class CommonDataType extends AstNode {

	private String type;
	private Integer size;
	private Integer precision;
	private boolean varsize;
	private Integer minSize;
	
	public CommonDataType(Location location, String type, Integer size, Integer precision) {
		super(location);
		this.type = type;
		this.size = size;
		this.precision = precision;
	}
	
    public String getType() {
		return type;
	}

	public Integer getSize() {
		return size;
	}

	public Integer getPrecision() {
		return precision;
	}

    public boolean isVarsize() {
		return varsize;
	}

	public void setVarsize(boolean varsize) {
		this.varsize = varsize;
	}

	public Integer getMinSize() {
		return minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
	}

}
