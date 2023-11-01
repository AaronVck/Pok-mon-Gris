/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotom_guia_dex;


public class Pokemon {
    
   
   private int idPokemon;
   private String Sprite;
   private String NombrePokemon;
   private String Tipo1;
   private String Tipo2;
   private int PuntosDeSalud;
   private int AtaqueFisico;
   private int AtaqueEspecial;
   private int DefensaFisica;
   private int DefensaEspecial;
   private int Velocidad;
   private String Descripcion;
   private int PKMovimiento1;
   private String NombreMovimiento1;
   private String DescripcionMovimiento1;
   private int PotenciaMovimiento1;
   private int PrecisionMovimiento1;
   private String TipoMovimiento1;
   private boolean EfectoMovimiento1;
   private int PKMovimiento2;
   private String NombreMovimiento2;
   private String DescripcionMovimiento2; 
   private int PotenciaMovimiento2;
   private int PrecisionMovimiento2;
   private String TipoMovimiento2;
   private boolean EfectoMovimiento2;
   private int PKMovimiento3;
   private String NombreMovimiento3;
   private String DescripcionMovimiento3;
   private int PotenciaMovimiento3;
   private int PrecisionMovimiento3;
   private String TipoMovimiento3;
   private boolean EfectoMovimiento3;
   private int PKMovimiento4;
   private String NombreMovimiento4;
   private String DescripcionMovimiento4;
   private int PotenciaMovimiento4;
   private int PrecisionMovimiento4;
   private String TipoMovimiento4;
   private boolean EfectoMovimiento4;

    public String getCategoriaMovimiento1() {
        return CategoriaMovimiento1;
    }

    public void setCategoriaMovimiento1(String CategoriaMovimiento1) {
        this.CategoriaMovimiento1 = CategoriaMovimiento1;
    }

    public String getCategoriaMovimiento2() {
        return CategoriaMovimiento2;
    }

    public void setCategoriaMovimiento2(String CategoriaMovimiento2) {
        this.CategoriaMovimiento2 = CategoriaMovimiento2;
    }

    public String getCategoriaMovimiento3() {
        return CategoriaMovimiento3;
    }

    public void setCategoriaMovimiento3(String CategoriaMovimiento3) {
        this.CategoriaMovimiento3 = CategoriaMovimiento3;
    }

    public String getCategoriaMovimiento4() {
        return CategoriaMovimiento4;
    }

    public void setCategoriaMovimiento4(String CategoriaMovimiento4) {
        this.CategoriaMovimiento4 = CategoriaMovimiento4;
    }

    
   private String CategoriaMovimiento1;
   private String CategoriaMovimiento2;
   private String CategoriaMovimiento3;
   private String CategoriaMovimiento4;
   

    public Pokemon(int idPokemon, String Sprite, String NombrePokemon, String Tipo1, String Tipo2, int PuntosDeSalud, int AtaqueFisico, int AtaqueEspecial, int DefensaFisica, int DefensaEspecial, int Velocidad, int PKMovimiento1, String NombreMovimiento1, int PotenciaMovimiento1, int PrecisionMovimiento1, String TipoMovimiento1, boolean EfectoMovimiento1, int PKMovimiento2, String NombreMovimiento2, int PotenciaMovimiento2, int PrecisionMovimiento2, String TipoMovimiento2, boolean EfectoMovimiento2, int PKMovimiento3, String NombreMovimiento3, int PotenciaMovimiento3, int PrecisionMovimiento3, String TipoMovimiento3, boolean EfectoMovimiento3, int PKMovimiento4, String NombreMovimiento4, int PotenciaMovimiento4, int PrecisionMovimiento4, String TipoMovimiento4, boolean EfectoMovimiento4, String CategoriaMovimiento1, String CategoriaMovimiento2, String CategoriaMovimiento3, String CategoriaMovimiento4) {
        this.idPokemon = idPokemon;
        this.Sprite = Sprite;
        this.NombrePokemon = NombrePokemon;
        this.Tipo1 = Tipo1;
        this.Tipo2 = Tipo2;
        this.PuntosDeSalud = PuntosDeSalud;
        this.AtaqueFisico = AtaqueFisico;
        this.AtaqueEspecial = AtaqueEspecial;
        this.DefensaFisica = DefensaFisica;
        this.DefensaEspecial = DefensaEspecial;
        this.Velocidad = Velocidad;
        this.PKMovimiento1 = PKMovimiento1;
        this.NombreMovimiento1 = NombreMovimiento1;
        this.PotenciaMovimiento1 = PotenciaMovimiento1;
        this.PrecisionMovimiento1 = PrecisionMovimiento1;
        this.TipoMovimiento1 = TipoMovimiento1;
        this.EfectoMovimiento1 = EfectoMovimiento1;
        this.PKMovimiento2 = PKMovimiento2;
        this.NombreMovimiento2 = NombreMovimiento2;
  
        this.PotenciaMovimiento2 = PotenciaMovimiento2;
        this.PrecisionMovimiento2 = PrecisionMovimiento2;
        this.TipoMovimiento2 = TipoMovimiento2;
        this.EfectoMovimiento2 = EfectoMovimiento2;
        this.PKMovimiento3 = PKMovimiento3;
        this.NombreMovimiento3 = NombreMovimiento3;
        this.PotenciaMovimiento3 = PotenciaMovimiento3;
        this.PrecisionMovimiento3 = PrecisionMovimiento3;
        this.TipoMovimiento3 = TipoMovimiento3;
        this.EfectoMovimiento3 = EfectoMovimiento3;
        this.PKMovimiento4 = PKMovimiento4;
        this.NombreMovimiento4 = NombreMovimiento4;
        this.PotenciaMovimiento4 = PotenciaMovimiento4;
        this.PrecisionMovimiento4 = PrecisionMovimiento4;
        this.TipoMovimiento4 = TipoMovimiento4;
        this.EfectoMovimiento4 = EfectoMovimiento4;
        
        this.CategoriaMovimiento1 = CategoriaMovimiento1;
        this.CategoriaMovimiento2 = CategoriaMovimiento2;
        this.CategoriaMovimiento3 = CategoriaMovimiento3;
        this.CategoriaMovimiento4 = CategoriaMovimiento4;
    }

    Pokemon() {
    }
   
  

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombrePokemon() {
        return NombrePokemon;
    }

    public void setNombrePokemon(String NombrePokemon) {
        this.NombrePokemon = NombrePokemon;
    }

    public String getTipo1() {
        return Tipo1;
    }

    public void setTipo1(String Tipo1) {
        this.Tipo1 = Tipo1;
    }

    public String getTipo2() {
        return Tipo2;
    }

    public void setTipo2(String Tipo2) {
        this.Tipo2 = Tipo2;
    }

    public int getPuntosDeSalud() {
        return PuntosDeSalud;
    }

    public void setPuntosDeSalud(int PuntosDeSalud) {
        this.PuntosDeSalud = PuntosDeSalud;
    }

    public int getAtaqueFisico() {
        return AtaqueFisico;
    }

    public void setAtaqueFisico(int AtaqueFisico) {
        this.AtaqueFisico = AtaqueFisico;
    }

    public int getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(int AtaqueEspecial) {
        this.AtaqueEspecial = AtaqueEspecial;
    }

    public int getDefensaFisica() {
        return DefensaFisica;
    }

    public void setDefensaFisica(int DefensaFisica) {
        this.DefensaFisica = DefensaFisica;
    }

    public int getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(int DefensaEspecial) {
        this.DefensaEspecial = DefensaEspecial;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getSprite() {
        return Sprite;
    }

    public void setSprite(String Sprite) {
        this.Sprite = Sprite;
    }

    public int getPKMovimiento1() {
        return PKMovimiento1;
    }

    public void setPKMovimiento1(int PKMovimiento1) {
        this.PKMovimiento1 = PKMovimiento1;
    }

    public String getNombreMovimiento1() {
        return NombreMovimiento1;
    }

    public void setNombreMovimiento1(String NombreMovimiento1) {
        this.NombreMovimiento1 = NombreMovimiento1;
    }

    public String getDescripcionMovimiento1() {
        return DescripcionMovimiento1;
    }

    public void setDescripcionMovimiento1(String DescripcionMovimiento1) {
        this.DescripcionMovimiento1 = DescripcionMovimiento1;
    }

    public int getPotenciaMovimiento1() {
        return PotenciaMovimiento1;
    }

    public void setPotenciaMovimiento1(int PotenciaMovimiento1) {
        this.PotenciaMovimiento1 = PotenciaMovimiento1;
    }

    public int getPrecisionMovimiento1() {
        return PrecisionMovimiento1;
    }

    public void setPrecisionMovimiento1(int PrecisionMovimiento1) {
        this.PrecisionMovimiento1 = PrecisionMovimiento1;
    }

    public String getTipoMovimiento1() {
        return TipoMovimiento1;
    }

    public void setTipoMovimiento1(String TipoMovimiento1) {
        this.TipoMovimiento1 = TipoMovimiento1;
    }

    public boolean isEfectoMovimiento1() {
        return EfectoMovimiento1;
    }

    public void setEfectoMovimiento1(boolean EfectoMovimiento1) {
        this.EfectoMovimiento1 = EfectoMovimiento1;
    }

    public int getPKMovimiento2() {
        return PKMovimiento2;
    }

    public void setPKMovimiento2(int PKMovimiento2) {
        this.PKMovimiento2 = PKMovimiento2;
    }

    public String getNombreMovimiento2() {
        return NombreMovimiento2;
    }

    public void setNombreMovimiento2(String NombreMovimiento2) {
        this.NombreMovimiento2 = NombreMovimiento2;
    }

    public String getDescripcionMovimiento2() {
        return DescripcionMovimiento2;
    }

    public void setDescripcionMovimiento2(String DescripcionMovimiento2) {
        this.DescripcionMovimiento2 = DescripcionMovimiento2;
    }

    public int getPotenciaMovimiento2() {
        return PotenciaMovimiento2;
    }

    public void setPotenciaMovimiento2(int PotenciaMovimiento2) {
        this.PotenciaMovimiento2 = PotenciaMovimiento2;
    }

    public int getPrecisionMovimiento2() {
        return PrecisionMovimiento2;
    }

    public void setPrecisionMovimiento2(int PrecisionMovimiento2) {
        this.PrecisionMovimiento2 = PrecisionMovimiento2;
    }

    public String getTipoMovimiento2() {
        return TipoMovimiento2;
    }

    public void setTipoMovimiento2(String TipoMovimiento2) {
        this.TipoMovimiento2 = TipoMovimiento2;
    }

    public boolean isEfectoMovimiento2() {
        return EfectoMovimiento2;
    }

    public void setEfectoMovimiento2(boolean EfectoMovimiento2) {
        this.EfectoMovimiento2 = EfectoMovimiento2;
    }

    public int getPKMovimiento3() {
        return PKMovimiento3;
    }

    public void setPKMovimiento3(int PKMovimiento3) {
        this.PKMovimiento3 = PKMovimiento3;
    }

    public String getNombreMovimiento3() {
        return NombreMovimiento3;
    }

    public void setNombreMovimiento3(String NombreMovimiento3) {
        this.NombreMovimiento3 = NombreMovimiento3;
    }

    public String getDescripcionMovimiento3() {
        return DescripcionMovimiento3;
    }

    public void setDescripcionMovimiento3(String DescripcionMovimiento3) {
        this.DescripcionMovimiento3 = DescripcionMovimiento3;
    }

    public int getPotenciaMovimiento3() {
        return PotenciaMovimiento3;
    }

    public void setPotenciaMovimiento3(int PotenciaMovimiento3) {
        this.PotenciaMovimiento3 = PotenciaMovimiento3;
    }

    public int getPrecisionMovimiento3() {
        return PrecisionMovimiento3;
    }

    public void setPrecisionMovimiento3(int PrecisionMovimiento3) {
        this.PrecisionMovimiento3 = PrecisionMovimiento3;
    }

    public String getTipoMovimiento3() {
        return TipoMovimiento3;
    }

    public void setTipoMovimiento3(String TipoMovimiento3) {
        this.TipoMovimiento3 = TipoMovimiento3;
    }

    public boolean isEfectoMovimiento3() {
        return EfectoMovimiento3;
    }

    public void setEfectoMovimiento3(boolean EfectoMovimiento3) {
        this.EfectoMovimiento3 = EfectoMovimiento3;
    }

    public int getPKMovimiento4() {
        return PKMovimiento4;
    }

    public void setPKMovimiento4(int PKMovimiento4) {
        this.PKMovimiento4 = PKMovimiento4;
    }

    public String getNombreMovimiento4() {
        return NombreMovimiento4;
    }

    public void setNombreMovimiento4(String NombreMovimiento4) {
        this.NombreMovimiento4 = NombreMovimiento4;
    }

    public String getDescripcionMovimiento4() {
        return DescripcionMovimiento4;
    }

    public void setDescripcionMovimiento4(String DescripcionMovimiento4) {
        this.DescripcionMovimiento4 = DescripcionMovimiento4;
    }

    public int getPotenciaMovimiento4() {
        return PotenciaMovimiento4;
    }

    public void setPotenciaMovimiento4(int PotenciaMovimiento4) {
        this.PotenciaMovimiento4 = PotenciaMovimiento4;
    }

    public int getPrecisionMovimiento4() {
        return PrecisionMovimiento4;
    }

    public void setPrecisionMovimiento4(int PrecisionMovimiento4) {
        this.PrecisionMovimiento4 = PrecisionMovimiento4;
    }

    public String getTipoMovimiento4() {
        return TipoMovimiento4;
    }

    public void setTipoMovimiento4(String TipoMovimiento4) {
        this.TipoMovimiento4 = TipoMovimiento4;
    }

    public boolean isEfectoMovimiento4() {
        return EfectoMovimiento4;
    }

    public void setEfectoMovimiento4(boolean EfectoMovimiento4) {
        this.EfectoMovimiento4 = EfectoMovimiento4;
    }
  

    
}
