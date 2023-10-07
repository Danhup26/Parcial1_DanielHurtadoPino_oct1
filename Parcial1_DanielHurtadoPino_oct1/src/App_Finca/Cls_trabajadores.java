
package App_Finca;

public class Cls_trabajadores {

  
    private String str_id;
    private String str_nombres;
    private String str_apellidos;
    private String str_correo;
    private String str_direccion;
    private String str_sexo;
    private int int_contacto;
    private float flt_salario;
    
      public Cls_trabajadores(String id, String nombres, String apellidos, String correo, String direccion, String sexo, int contacto, float salario){
    this.str_id = id;
    this.str_nombres = nombres;
    this.str_apellidos= apellidos;
    this.str_correo = correo;
    this.str_direccion = direccion;
    this.str_sexo = sexo;
    this.int_contacto = contacto;
    this.flt_salario = salario;
   }
    
      public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }

    public String getStr_nombres() {
        return str_nombres;
    }

    public void setStr_nombres(String str_nombres) {
        this.str_nombres = str_nombres;
    }

    public String getStr_apellidos() {
        return str_apellidos;
    }

    public void setStr_apellidos(String str_apellidos) {
        this.str_apellidos = str_apellidos;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public String getStr_direccion() {
        return str_direccion;
    }

    public void setStr_direccion(String str_direccion) {
        this.str_direccion = str_direccion;
    }

    public String getStr_sexo() {
        return str_sexo;
    }

    public void setStr_sexo(String str_sexo) {
        this.str_sexo = str_sexo;
    }

    public int getInt_contacto() {
        return int_contacto;
    }

    public void setInt_contacto(int int_contacto) {
        this.int_contacto = int_contacto;
    }

    public float getFlt_salario() {
        return flt_salario;
    }

    public void setFlt_salario(float flt_salario) {
        this.flt_salario = flt_salario;
    }
}

