package py.com.ventu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.com.ventu.entidades.Caja;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-12-19T19:44:54")
@StaticMetamodel(Configuraciones.class)
public class Configuraciones_ { 

    public static volatile SingularAttribute<Configuraciones, Integer> id;
    public static volatile SingularAttribute<Configuraciones, String> direccion;
    public static volatile SingularAttribute<Configuraciones, String> usuarioMod;
    public static volatile SingularAttribute<Configuraciones, Boolean> imprimirTicket;
    public static volatile SingularAttribute<Configuraciones, String> comercio;
    public static volatile SingularAttribute<Configuraciones, String> ruc;
    public static volatile SingularAttribute<Configuraciones, String> telefono;
    public static volatile SingularAttribute<Configuraciones, String> rutaInformes;
    public static volatile SingularAttribute<Configuraciones, Date> fechaMod;
    public static volatile SingularAttribute<Configuraciones, Caja> caja;

}