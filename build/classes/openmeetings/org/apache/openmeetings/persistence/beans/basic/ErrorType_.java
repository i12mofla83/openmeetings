/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.basic;

import java.lang.Boolean;
import java.lang.Long;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.basic.ErrorType.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:09 CST 2013")
public class ErrorType_ {
    public static volatile SingularAttribute<ErrorType,Boolean> deleted;
    public static volatile SingularAttribute<ErrorType,Long> errortype_id;
    public static volatile SingularAttribute<ErrorType,Long> fieldvalues_id;
    public static volatile SingularAttribute<ErrorType,Date> starttime;
    public static volatile SingularAttribute<ErrorType,Date> updatetime;
}