package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.Caja;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(Cobranza.class)
public class Cobranza_ { 

    public static volatile SingularAttribute<Cobranza, Integer> nroTrans;
    public static volatile SingularAttribute<Cobranza, Integer> codCliente;
    public static volatile SingularAttribute<Cobranza, String> usuarioMod;
    public static volatile SingularAttribute<Cobranza, Date> fecha;
    public static volatile SingularAttribute<Cobranza, Integer> nroRecibo;
    public static volatile SingularAttribute<Cobranza, Double> importeTotal;
    public static volatile SingularAttribute<Cobranza, Caja> caja;

}