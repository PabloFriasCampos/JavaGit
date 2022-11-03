public class HorarioColores {
    public static void main(String[] args) {
        System.out.println("┌─────────────────┬─────────────────────┬───────────┬─────────────────┬─────────────────────┐");
        System.out.println("│ Lunes           │ Martes              │ Miercoles │ Jueves          │ Viernes             │");
        System.out.println("├─────────────────┼─────────────────────┼───────────┼─────────────────┼─────────────────────┤");
        //FILA 1
        System.out.print("│ \033[31m Sistemas \033[39;49m      │ \033[32m Programacion \033[39;49m      │");
        System.out.println(" \033[31m Sistemas \033[39;49m│ \033[32m Programacion \033[39;49m  │ \033[32m Programacion \033[39;49m      │");
        //FILA 2
        System.out.print("│ \033[32m Programacion \033[39;49m  │ \033[32m Programacion \033[39;49m      │");
        System.out.println(" \033[34m FOL \033[39;49m     │  Ingles         │ \033[32m Programacion \033[39;49m      │");
        //FILA 3
        System.out.print("│ \033[32m Programacion \033[39;49m  │ \033[90m Lenguaje de Marcas \033[39;49m│");
        System.out.println(" \033[34m FOL \033[39;49m     │ \033[33m Bases de Datos \033[39;49m│ \033[33m Bases de Datos \033[39;49m    │");
        //FILA 4
        System.out.print("│ \033[95m RECREO  \033[39;49m       │ \033[95m RECREO  \033[39;49m           │");
        System.out.println(" \033[95m RECREO  \033[39;49m │ \033[95m RECREO  \033[39;49m       │ \033[95m RECREO  \033[39;49m           │");
        //FILA 5
        System.out.print("│ \033[34m FOL \033[39;49m           │ \033[90m Lenguaje de Marcas \033[39;49m│");
        System.out.println(" \033[36m Entornos \033[39;49m│ \033[33m Bases de Datos \033[39;49m│ \033[33m Bases de Datos \033[39;49m    │");
        //FILA 6
        System.out.print("│ \033[33m Bases de Datos \033[39;49m│ \033[31m Sistemas \033[39;49m          │");
        System.out.println(" \033[36m Entornos \033[39;49m│ \033[31m Sistemas \033[39;49m      │ \033[90m Lenguaje de Marcas \033[39;49m│");
        //FILA 7
        System.out.print("│ \033[33m Bases de Datos \033[39;49m│ \033[31m Sistemas \033[39;49m          │");
        System.out.println(" \033[36m Entornos \033[39;49m│ \033[31m Sistemas \033[39;49m      │ \033[90m Lenguaje de Marcas \033[39;49m│");
        System.out.println("└─────────────────┴─────────────────────┴───────────┴─────────────────┴─────────────────────┘");
}
}
