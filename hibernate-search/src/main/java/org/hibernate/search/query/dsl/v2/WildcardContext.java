package org.hibernate.search.query.dsl.v2;

/**
 * @author Emmanuel Bernard
 */
public interface WildcardContext extends QueryCustomization<WildcardContext> {
	/**
	 * field / property the term query is executed on
	 */
	TermMatchingContext onField(String field);

}