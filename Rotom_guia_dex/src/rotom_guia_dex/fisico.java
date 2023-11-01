
package rotom_guia_dex;

public class fisico  extends movimientos{
    
    public fisico(String CategoriaMovimiento) {
        this.CategoriaMovimiento = CategoriaMovimiento;
    }

    public String getCategoriaMovimiento() {
        return CategoriaMovimiento;
    }

    public void setCategoriaMovimiento(String CategoriaMovimiento) {
        this.CategoriaMovimiento = CategoriaMovimiento;
    }
    private String CategoriaMovimiento;
    
    fisico() {
        
    }
    public fisico(String NombreMovimiento, String DescripcionMovimiento, int PotenciaMovimiento,int PK,int PrecisionMovimiento, String TipoMovimiento, String CategoriaMovimiento, boolean EfectoMovimiento) {
        super(NombreMovimiento, DescripcionMovimiento, PotenciaMovimiento, PK, PrecisionMovimiento, TipoMovimiento, EfectoMovimiento);
    }
}
