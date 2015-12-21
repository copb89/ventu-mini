package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(SaPendientes.class)
public class SaPendientes_ { 

    public static volatile SingularAttribute<SaPendientes, Integer> nroTrans;
    public static volatile SingularAttribute<SaPendientes, Date> fecDoc;
    public static volatile SingularAttribute<SaPendientes, Integer> cliente;
    public static volatile SingularAttribute<SaPendientes, Date> vencimiento;
    public static volatile SingularAttribute<SaPendientes, Integer> refTicket;
    public static volatile SingularAttribute<SaPendientes, Integer> refCaja;
    public static volatile SingularAttribute<SaPendientes, Double> importeOrigen;
    public static volatile SingularAttribute<SaPendientes, Double> saldo;

}