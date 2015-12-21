package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.CobranzaDetPK;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(CobranzaDet.class)
public class CobranzaDet_ { 

    public static volatile SingularAttribute<CobranzaDet, Double> importe;
    public static volatile SingularAttribute<CobranzaDet, String> codEmiFac;
    public static volatile SingularAttribute<CobranzaDet, CobranzaDetPK> cobranzaDetPK;
    public static volatile SingularAttribute<CobranzaDet, Integer> nroDocum;
    public static volatile SingularAttribute<CobranzaDet, Integer> ticket;
    public static volatile SingularAttribute<CobranzaDet, Integer> refOperacion;
    public static volatile SingularAttribute<CobranzaDet, String> codSucFac;
    public static volatile SingularAttribute<CobranzaDet, Date> fechaVto;

}