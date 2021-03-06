/**
 * Created by cooperg2832 on 6/1/2017.
 */
public class PlayerDatabase
{
        static Player PG1 = new Player("Russell Westbrook", 42.5, 41.7, 34.3, 30.0);
        static Player SG1 = new Player("Victor Oladipo", 44.2, 21.4, 36.1, 38.1);
        static Player SF1 = new Player("Andre Roberson", 46.4, 10.1, 24.5, 39.0);
        static Player PF1 = new Player("Domantas Sabonis", 39.9, 15.4, 32.1, 33.9);
        static Player C1 = new Player("Steven Adams", 57.1, 16.2, 0.0, 0.0);

        static Player PG2 = new Player("Stephen Curry", 46.8, 30.1, 41.1, 54.6);
        static Player SG2 = new Player("Klay Thompson", 46.8, 26.1, 41.4, 47.2);
        static Player SF2 = new Player("Kevin Durant", 53.7, 27.8, 37.5, 30.3);
        static Player PF2 = new Player("Draymond Green", 41.8, 16.2, 30.8, 40.7);
        static Player C2 = new Player("Zaza Pachulia", 53.4, 15.3, 0.0, 0.0);

        static Player PG3 = new Player("Kyrie Irving", 47.3, 30.8, 40.1, 31.0);
        static Player SG3 = new Player("J.R. Smith", 34.6, 14.6, 35.1, 75.9);
        static Player SF3 = new Player("LeBron James", 54.8, 30.0, 36.3, 25.3);
        static Player PF3 = new Player("Kevin Love", 42.7, 26.4, 37.3, 44.8);
        static Player C3 = new Player("Tristan Thomson", 60.0, 11.3, 0.0, 0.0);

        static Player PG4 = new Player("Jordan Clarkson", 44.5, 23.3, 32.9, 32.8);
        static Player SG4 = new Player("D'Angelo Russell", 40.5, 26.6, 35.2, 44.2);
        static Player SF4 = new Player("Brandon Ingram", 40.2, 16.8, 29.4, 27.6);
        static Player PF4 = new Player("Julius Randle", 48.8, 21.4, 27.0, 8.7);
        static Player C4 = new Player("Ivica Zubac", 52.9, 20.3, 0.0, 1.6);

        static Player PG5 = new Player("Tony Parker", 46.6, 20.2, 33.3, 12.2);
        static Player SG5 = new Player("Danny Green", 39.2, 13.5, 37.9, 69.7);
        static Player SF5 = new Player("Kawhi Leonard", 48.5, 31.1, 38.0, 29.4);
        static Player PF5 = new Player("LaMArcus Aldridge", 47.7, 24.5, 41.1, 5.5);
        static Player C5 = new Player("Dewayne Dedmon", 62.2, 12.3, 0.0, 0.0);

        static Player PG6 = new Player("Rajon Rondo", 40.8, 17.8, 37.6, 23.5);
        static Player SG6 = new Player("Dwayne Wade", 43.4, 29.6, 31.0, 15.1);
        static Player SF6 = new Player("Jimmy Butler", 45.5, 26.5, 36.7, 20.0);
        static Player PF6 = new Player("Bobby Portis", 48.8, 19.1, 33.3, 25.4);
        static Player C6 = new Player("Robin Lopez", 49.3, 17.5, 0.0, 0.0);

        static Player PG7 = new Player("Isaiah Thomas", 46.3, 34.0, 37.9, 43.8);
        static Player SG7 = new Player("Avery Bradley", 46.3, 21.9, 39.0, 35.5);
        static Player SF7 = new Player("Jae Crowder", 46.3, 17.0, 39.8, 55.0);
        static Player PF7 = new Player("Al Horford", 47.3, 19.8, 35.5, 30.5);
        static Player C7 = new Player("Amir Johnson", 57.6, 13.6, 40.9, 17.4);

        static Player PG8 = new Player("Derrick Rose", 47.1, 25.7, 21.7, 5.9);
        static Player SG8 = new Player("Courtney Lee", 45.6, 14.4, 40.1, 38.5);
        static Player SF8 = new Player("Carmelo Anthony", 43.3, 29.1, 35.9, 30.3);
        static Player PF8 = new Player("Kristaps Porzingis", 45.0, 24.3, 35.7, 32.2);
        static Player C8 = new Player("Joakim Noah", 49.3, 12.5, 0.0, 0.0);

        static Player PG9 = new Player("Kyle Lowry", 46.4, 24.9, 41.2, 51.0);
        static Player SG9 = new Player("DeMar DeRozan", 46.7, 34.3, 26.6, 8.1);
        static Player SF9 = new Player("DeMarre Carroll", 40.1, 15.5, 34.1, 57.9);
        static Player PF9 = new Player("Serge Ibaka", 45.9, 20.9, 39.8, 37.2);
        static Player C9 = new Player("Jonas Valanciunas", 55.7, 19.5, 50.0, 0.0);

        static Player PG10 = new Player("Goran Dragic", 47.5, 27.1, 40.5, 26.0);
        static Player SG10 = new Player("Dion Waiters", 42.4, 26.3, 39.5, 32.6);
        static Player SF10 = new Player("Rodney McGruder", 41.3, 12.3, 33.2, 47.5);
        static Player PF10 = new Player("Luke Babbitt", 40.2, 13.0, 41.4, 75.6);
        static Player C10 = new Player("Hassan Whiteside", 55.7, 22.7, 0.0, 0.0);




        static Team thunder = new Team(PG1, SG1, SF1, PF1, C1, 27.8, "Thunder");
        static Team warriors = new Team(PG2, SG2, SF2, PF2, C2, 22.5, "Warriors");
        static Team cavaliers = new Team(PG3, SG3, SF3, PF3, C3, 22.1, "Cavaliers");
        static Team lakers = new Team(PG4, SG4, SF4, PF4, C4, 25.0, "Lakers");
        static Team spurs = new Team(PG5, SG5, SF5, PF5, C5, 24.9, "Spurs");
        static Team bulls = new Team(PG6, SG6, SF6, PF6, C6, 27.2, "Bulls");
        static Team celtics = new Team(PG7, SG7, SF7, PF7, C7, 21.4, "Celtics");
        static Team knicks = new Team(PG8, SG8, SF8, PF8, C8, 26.6, "Knicks");
        static Team raptors = new Team(PG9, SG9, SF9, PF9, C9, 24.2, "Raptors");
        static Team heat = new Team(PG10, SG10, SF10, PF10, C10, 24.2, "Heat");

        public Team returnTeam(String t)
        {
                if(t.equals("Warriors"))
                {
                        return warriors;
                }
                if (t.equals("Thunder"))
                {
                        return thunder;
                }
                if (t.equals("Cavaliers"))
                {
                        return cavaliers;
                }
                if (t.equals("Lakers"))
                {
                        return lakers;
                }
                if (t.equals("Spurs"))
                {
                        return spurs;
                }
                if (t.equals("Bulls"))
                {
                        return bulls;
                }
                if (t.equals("Celtics"))
                {
                        return celtics;
                }
                if (t.equals("Knicks"))
                {
                        return knicks;
                }
                if (t.equals("Raptors"))
                {
                        return raptors;
                }
                if (t.equals("Heat"))
                {
                        return heat;
                }
                return warriors;
        }
}
