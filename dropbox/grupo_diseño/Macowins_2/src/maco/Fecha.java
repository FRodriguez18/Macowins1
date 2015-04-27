package maco;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
     
    public Fecha(int dia,int mes,int año)
    {
        //recibe un dia mes y año y los setea en los parametros
        setDia(dia);
        setMes(mes);
        setAño(año);
    }
     
    public String toString()
    {
        //se usa String.valueOf para pasar un int a un string y poder concatenarlo con las barras
        return (String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(año));
    }
     
    public boolean equals(Fecha otra) //para ver si una fecha es la misma que otra
    {
        boolean retorno = (otra.dia == dia)&& (otra.mes == mes) && (otra.año == año); //verifica si el dia mes y año de cada fecha son iguales
        return retorno;
    }
     
    //getters y setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
 
    public int getMes() {
        return mes;
    }
 
    public void setMes(int mes) {
        this.mes = mes;
    }
 
    public int getAño() {
        return año;
    }
 
    public void setAño(int año) {
        this.año = año;
    }
}