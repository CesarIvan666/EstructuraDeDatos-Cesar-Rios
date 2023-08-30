package tarea2.autobuses.process;
/**
 * Clase que representa a un pasajero.
 */
public class Passenger {
        private String name;
        private int number;
        private boolean isVip;

        /**
         * Constructor para inicializar un objeto Passenger.
         *
         * @param name   El nombre del pasajero.
         * @param number El número del pasajero.
         * @param isVip  Indica si el pasajero es VIP o no.
         */
        public Passenger(String name, int number, boolean isVip) {
                this.name = name;
                this.number = number;
                this.isVip = isVip;
        }

        /**
         * Obtiene el nombre del pasajero.
         *
         * @return El nombre del pasajero.
         */
        public String getName() {
                return name;
        }

        /**
         * Obtiene el número del pasajero.
         *
         * @return El número del pasajero.
         */
        public int getNumber() {
                return number;
        }

        /**
         * Verifica si el pasajero es VIP.
         *
         * @return true si el pasajero es VIP, false en caso contrario.
         */
        public boolean isVip() {
                return isVip;
        }

        /**
         * Representación en forma de cadena del pasajero.
         *
         * @return Una cadena que representa al pasajero, incluyendo su estado VIP si aplica.
         */
        public String toString() {
                return (isVip ? "*VIP* " : "") + "Nombre: " + name + "/ Numero: " + number;
        }
}
