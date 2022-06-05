package projetojava;

public class Consulta
{
   private Data_hora data_marcada;
   private Medico medico_marcado;
   private String paciente;
   
   Consulta(Data_hora data_marcada,Medico medico_marcado, String paciente)
   {
       this.data_marcada=data_marcada;
       this.medico_marcado=medico_marcado;
       this.paciente=paciente;
   }

    public Data_hora getData_marcada() {
        return data_marcada;
    }

    public void setData_marcada(Data_hora data_marcada) {
        this.data_marcada = data_marcada;
    }

    public Medico getMedico_marcado() {
        return medico_marcado;
    }

    public void setMedico_marcado(Medico medico_marcado) {
        this.medico_marcado = medico_marcado;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }


    
   
   
           
}