package projetojava;

public class Data_hora 
{
    private int mes;
    private int dia;
    private int hora;
    
    Data_hora(int mes, int dia, int hora)
    {
        this.mes=mes;
        this.dia=dia;
    }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

}
