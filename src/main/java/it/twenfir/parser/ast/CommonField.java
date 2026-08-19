package it.twenfir.parser.ast;

public interface CommonField {
	
    public String getName();
    public boolean isReference();
    public abstract CommonDataType getDataType();
	public CommonRefField getRefField();
	
	default public Object getSst() {
		return null;
	}
}
