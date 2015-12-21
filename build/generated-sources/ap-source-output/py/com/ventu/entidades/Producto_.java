package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.TipoProducto;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<Producto, Double> descuento;
    public static volatile SingularAttribute<Producto, String> usuarioMod;
    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Double> costo;
    public static volatile SingularAttribute<Producto, Double> precioVenta;
    public static volatile SingularAttribute<Producto, Double> stockMinimo;
    public static volatile SingularAttribute<Producto, Integer> impuesto;
    public static volatile SingularAttribute<Producto, Date> fechaMod;
    public static volatile SingularAttribute<Producto, Double> stockActual;

}