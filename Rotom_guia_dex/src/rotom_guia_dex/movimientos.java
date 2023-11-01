
package rotom_guia_dex;

public class movimientos {
    
    public movimientos(){
        
    }
    
    public movimientos(String NombreMovimiento, String DescripcionMovimiento, int PotenciaMovimiento, int PK, int PrecisionMovimiento, String TipoMovimiento, boolean EfectoMovimiento) {
        this.EfectoMovimiento = EfectoMovimiento;
        this.PK = PK;
        this.PrecisionMovimiento = PrecisionMovimiento;
        this.NombreMovimiento = NombreMovimiento;
        this.TipoMovimiento = TipoMovimiento;
        this.DescripcionMovimiento = DescripcionMovimiento;
        this.PotenciaMovimiento = PotenciaMovimiento;
    }
     public String getNombreMovimiento() {
        return NombreMovimiento;
    }

    public void setNombreMovimiento(String NombreMovimiento) {
        this.NombreMovimiento = NombreMovimiento;
    }

    public String getDescripcionMovimiento() {
        return DescripcionMovimiento;
    }

    public void setDescripcionMovimiento(String DescripcionMovimiento) {
        this.DescripcionMovimiento = DescripcionMovimiento;
    }

    public int getPotenciaMovimiento() {
        return PotenciaMovimiento;
    }

    public void setPotenciaMovimiento(int PotenciaMovimiento) {
        this.PotenciaMovimiento = PotenciaMovimiento;
    }

    public movimientos(int PK) {
        this.PK = PK;
    }

    public int getPK() {
        return PK;
    }

    public void setPK(int PK) {
        this.PK = PK;
    }
    

    public int getPrecisionMovimiento() {
        return PrecisionMovimiento;
    }

    public void setPrecisionMovimiento(int PrecisionMovimiento) {
        this.PrecisionMovimiento = PrecisionMovimiento;
    }
    
    private int PK;
    private String NombreMovimiento;
    private String DescripcionMovimiento;
    private int PotenciaMovimiento;
    private int PrecisionMovimiento;
    private String TipoMovimiento;
    private boolean EfectoMovimiento;
    
    public movimientos(boolean EfectoMovimiento) {
        this.EfectoMovimiento = EfectoMovimiento;
    }

    public boolean isEfectoMovimiento() {
        return EfectoMovimiento;
    }

    public void setEfectoMovimiento(boolean EfectoMovimiento) {
        this.EfectoMovimiento = EfectoMovimiento;
    }
    public boolean getEfectoMovimiento() {
        return EfectoMovimiento;
    }
    
    public movimientos(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }

    public String getTipoMovimiento() {
        return TipoMovimiento;
    }

    public void setTipoMovimiento(String TipoMovimiento) {
        this.TipoMovimiento = TipoMovimiento;
    }
}
