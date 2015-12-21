package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.Caja;
import py.com.ventu.entidades.Cliente;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(FacturaVenta.class)
public class FacturaVenta_ { 

    public static volatile SingularAttribute<FacturaVenta, String> vendedor;
    public static volatile SingularAttribute<FacturaVenta, Double> totalDscto;
    public static volatile SingularAttribute<FacturaVenta, String> usuarioAnu;
    public static volatile SingularAttribute<FacturaVenta, Caja> caja;
    public static volatile SingularAttribute<FacturaVenta, Double> importeTotal;
    public static volatile SingularAttribute<FacturaVenta, Date> fechaAnu;
    public static volatile SingularAttribute<FacturaVenta, String> usuarioMod;
    public static volatile SingularAttribute<FacturaVenta, Integer> estado;
    public static volatile SingularAttribute<FacturaVenta, Cliente> cliente;
    public static volatile SingularAttribute<FacturaVenta, Integer> ticket;
    public static volatile SingularAttribute<FacturaVenta, Date> vencimiento;
    public static volatile SingularAttribute<FacturaVenta, Date> fechaVta;
    public static volatile SingularAttribute<FacturaVenta, Integer> condicionVenta;

}