package projetojava;

public class Medico 
{
    private int area_medicina;
    private int medico;
    
    Medico(int area_medicina, int medico)
    {
        this.area_medicina=area_medicina;
        this.medico=medico;
    }

    public int getArea_medicina() {
        return area_medicina;
    }

    public void setArea_medicina(int area_medicina) {
        this.area_medicina = area_medicina;
    }

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }
            
}
