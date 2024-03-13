package cz.spsmb.DTO;

;

    public class AnimalDTO {
        String kind;
        String name;


        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return "AnimalDTO{" +
                    "text='" + kind + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

