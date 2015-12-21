package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile SingularAttribute<Vendedor, Integer> id;
    public static volatile SingularAttribute<Vendedor, String> nombre;
    public static volatile SingularAttribute<Vendedor, String> usuarioMod;
    public static volatile SingularAttribute<Vendedor, Double> comision;
    public static volatile SingularAttribute<Vendedor, Date> fechaMod;

}