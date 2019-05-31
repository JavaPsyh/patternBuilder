package psyh;

class ComputerBuilder {

    private String monitor;
    private String systembox;
    private String manipulator;


    public String getMonitor() {
        return monitor;
    }

    public String getSystembox() {
        return systembox;
    }

    public String getManipulator() {
        return manipulator;
    }


    public static class Builder {

        private ComputerBuilder computerBuilder;

        public Builder() {
            computerBuilder = new ComputerBuilder();
        }

        public Builder withMonitor(String monitor) {
            computerBuilder.monitor = monitor;
            return this;
        }

        public Builder withSystembox(String systembox) {
            computerBuilder.systembox = systembox;
            return this;
        }

        public Builder withManipulator(String manipulator) {
            computerBuilder.manipulator = manipulator;
            return this;
        }

        public ComputerBuilder build() {
            return computerBuilder;
        }
    }

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder.Builder()
                .withManipulator("Keyboard")
                .withMonitor("LCD monitor")
                .withSystembox("Black systembox")
                .build();
    }
}

