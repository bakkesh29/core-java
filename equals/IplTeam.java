public class IplTeam {

    private int teamId;
    private String teamName;
    private String captain;
    private int trophies;
    private double netRunRate;

    public IplTeam() {

    }

    public IplTeam(int teamId, String teamName, String captain,
                   int trophies, double netRunRate) {

        this.teamId = teamId;
        this.teamName = teamName;
        this.captain = captain;
        this.trophies = trophies;
        this.netRunRate = netRunRate;
    }

    @Override
    public boolean equals(Object ref) {

        if (ref == null) {
            return false;
        }

        if (ref instanceof IplTeam) {

            if (this.teamId == ((IplTeam) ref).teamId &&
                this.trophies == ((IplTeam) ref).trophies &&
                this.netRunRate == ((IplTeam) ref).netRunRate &&
                this.teamName.equals(((IplTeam) ref).teamName) &&
                this.captain.equals(((IplTeam) ref).captain)) {

                return true;
            }
        }

        return false;
    }
}