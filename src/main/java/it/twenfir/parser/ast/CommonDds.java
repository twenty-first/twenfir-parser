package it.twenfir.parser.ast;

import java.util.Iterator;

public interface CommonDds<F extends CommonField> {

	public Iterator<F> getFields();
	public CommonRef getRef();
}
