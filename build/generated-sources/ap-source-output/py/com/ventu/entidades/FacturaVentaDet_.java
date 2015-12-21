package py.com.ventu.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.FacturaVentaDetPK;
import py.com.ventu.entidades.Producto;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(FacturaVentaDet.class)
public class FacturaVentaDet_ { 

    public static volatile SingularAttribute<FacturaVentaDet, Double> impDscto;
    public static volatile SingularAttribute<FacturaVentaDet, Double> precioUnit;
    public static volatile SingularAttribute<FacturaVentaDet, FacturaVentaDetPK> facturaVentaDetPK;
    public static volatile SingularAttribute<FacturaVentaDet, Double> cantidad;
    public static volatile SingularAttribute<FacturaVentaDet, Double> subototal;
    public static volatile SingularAttribute<FacturaVentaDet, Producto> producto;
    public static volatile SingularAttribute<FacturaVentaDet, Double> procDscto;
    public static volatile SingularAttribute<FacturaVentaDet, Double> factor;

}