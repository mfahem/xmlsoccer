package pl.com.pablo.xmlsoccer.model.xml;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.14 at 08:04:17 AM CEST 
//

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeamLeagueStanding">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Team_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Played" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PlayedAtHome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PlayedAway" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Won" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Draw" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Lost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="NumberOfShots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="YellowCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RedCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Goals_For" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Goals_Against" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Goal_Difference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teamLeagueStanding",
    "accountInformation"
})
@XmlRootElement(name = "XMLSOCCER.COM")
public class GetLeagueStandingsBySeasonResultXML {

    @XmlElement(name = "TeamLeagueStanding", required = true, namespace="http://xmlsoccer.com/LeagueStanding")
    protected List<TeamLeagueStanding> teamLeagueStanding;
    @XmlElement(name = "AccountInformation", required = true)
    protected String accountInformation;

    /**
     * Gets the value of the teamLeagueStanding property.
     *
     * @return
     *     possible object is
     *     {@link GetLeagueStandingsBySeasonResultXML.TeamLeagueStanding }
     *
     */
    public List<TeamLeagueStanding> getTeamLeagueStanding() {
        return teamLeagueStanding;
    }

    /**
     * Sets the value of the teamLeagueStanding property.
     *
     * @param value
     *     allowed object is
     *     {@link GetLeagueStandingsBySeasonResultXML.TeamLeagueStanding }
     *
     */
    public void setTeamLeagueStanding(List<TeamLeagueStanding> value) {
        this.teamLeagueStanding = value;
    }

    /**
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInformation(String value) {
        this.accountInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Team_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Played" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PlayedAtHome" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PlayedAway" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Won" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Draw" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Lost" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="NumberOfShots" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="YellowCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="RedCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Goals_For" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Goals_Against" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Goal_Difference" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "team",
        "teamId",
        "played",
        "playedAtHome",
        "playedAway",
        "won",
        "draw",
        "lost",
        "numberOfShots",
        "yellowCards",
        "redCards",
        "goalsFor",
        "goalsAgainst",
        "goalDifference",
        "points"
    })
    public static class TeamLeagueStanding {

        @XmlElement(name = "Team", namespace="http://xmlsoccer.com/LeagueStanding")
        protected String team;
        @XmlElement(name = "Team_Id", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int teamId;
        @XmlElement(name = "Played", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int played;
        @XmlElement(name = "PlayedAtHome", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int playedAtHome;
        @XmlElement(name = "PlayedAway", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int playedAway;
        @XmlElement(name = "Won", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int won;
        @XmlElement(name = "Draw", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int draw;
        @XmlElement(name = "Lost", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int lost;
        @XmlElement(name = "NumberOfShots", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int numberOfShots;
        @XmlElement(name = "YellowCards", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int yellowCards;
        @XmlElement(name = "RedCards", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int redCards;
        @XmlElement(name = "Goals_For", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalsFor;
        @XmlElement(name = "Goals_Against", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalsAgainst;
        @XmlElement(name = "Goal_Difference", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int goalDifference;
        @XmlElement(name = "Points", namespace="http://xmlsoccer.com/LeagueStanding")
        protected int points;
        
        /**
         * Gets the value of the team property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeam() {
            return team;
        }

        /**
         * Sets the value of the team property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeam(String value) {
            this.team = value;
        }

        /**
         * Gets the value of the teamId property.
         * 
         */
        public int getTeamId() {
            return teamId;
        }

        /**
         * Sets the value of the teamId property.
         * 
         */
        public void setTeamId(int value) {
            this.teamId = value;
        }

        /**
         * Gets the value of the played property.
         * 
         */
        public int getPlayed() {
            return played;
        }

        /**
         * Sets the value of the played property.
         * 
         */
        public void setPlayed(int value) {
            this.played = value;
        }

        /**
         * Gets the value of the playedAtHome property.
         * 
         */
        public int getPlayedAtHome() {
            return playedAtHome;
        }

        /**
         * Sets the value of the playedAtHome property.
         * 
         */
        public void setPlayedAtHome(int value) {
            this.playedAtHome = value;
        }

        /**
         * Gets the value of the playedAway property.
         * 
         */
        public int getPlayedAway() {
            return playedAway;
        }

        /**
         * Sets the value of the playedAway property.
         * 
         */
        public void setPlayedAway(int value) {
            this.playedAway = value;
        }

        /**
         * Gets the value of the won property.
         * 
         */
        public int getWon() {
            return won;
        }

        /**
         * Sets the value of the won property.
         * 
         */
        public void setWon(int value) {
            this.won = value;
        }

        /**
         * Gets the value of the draw property.
         * 
         */
        public int getDraw() {
            return draw;
        }

        /**
         * Sets the value of the draw property.
         * 
         */
        public void setDraw(int value) {
            this.draw = value;
        }

        /**
         * Gets the value of the lost property.
         * 
         */
        public int getLost() {
            return lost;
        }

        /**
         * Sets the value of the lost property.
         * 
         */
        public void setLost(int value) {
            this.lost = value;
        }

        /**
         * Gets the value of the numberOfShots property.
         * 
         */
        public int getNumberOfShots() {
            return numberOfShots;
        }

        /**
         * Sets the value of the numberOfShots property.
         * 
         */
        public void setNumberOfShots(int value) {
            this.numberOfShots = value;
        }

        /**
         * Gets the value of the yellowCards property.
         * 
         */
        public int getYellowCards() {
            return yellowCards;
        }

        /**
         * Sets the value of the yellowCards property.
         * 
         */
        public void setYellowCards(int value) {
            this.yellowCards = value;
        }

        /**
         * Gets the value of the redCards property.
         * 
         */
        public int getRedCards() {
            return redCards;
        }

        /**
         * Sets the value of the redCards property.
         * 
         */
        public void setRedCards(int value) {
            this.redCards = value;
        }

        /**
         * Gets the value of the goalsFor property.
         * 
         */
        public int getGoalsFor() {
            return goalsFor;
        }

        /**
         * Sets the value of the goalsFor property.
         * 
         */
        public void setGoalsFor(int value) {
            this.goalsFor = value;
        }

        /**
         * Gets the value of the goalsAgainst property.
         * 
         */
        public int getGoalsAgainst() {
            return goalsAgainst;
        }

        /**
         * Sets the value of the goalsAgainst property.
         * 
         */
        public void setGoalsAgainst(int value) {
            this.goalsAgainst = value;
        }

        /**
         * Gets the value of the goalDifference property.
         * 
         */
        public int getGoalDifference() {
            return goalDifference;
        }

        /**
         * Sets the value of the goalDifference property.
         * 
         */
        public void setGoalDifference(int value) {
            this.goalDifference = value;
        }

        /**
         * Gets the value of the points property.
         * 
         */
        public int getPoints() {
            return points;
        }

        /**
         * Sets the value of the points property.
         * 
         */
        public void setPoints(int value) {
            this.points = value;
        }

        @Override
        public String toString() {
            //return "TeamLeagueStanding{" + "team=" + team + ", teamId=" + teamId + ", played=" + played + ", playedAtHome=" + playedAtHome + ", playedAway=" + playedAway + ", won=" + won + ", draw=" + draw + ", lost=" + lost + ", numberOfShots=" + numberOfShots + ", yellowCards=" + yellowCards + ", redCards=" + redCards + ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst + ", goalDifference=" + goalDifference + ", points=" + points + ", leagueName=" + leagueName + ", season=" + season + ", id=" + id + '}';
            return "LEAGUE STANDINGS: " + "  TEAM: " + team + "  PLAYED: " + played + "  PLAYED AT HOME: " + playedAtHome + "  PLAYED AWAY: " + playedAway + "  WON: " + won + "  DRAW: " + draw + "  LOST: " + lost + "  GOALS FOR: " + goalsFor + "  GOALS AGAINST: " + goalsAgainst + "  GOAL DIFFERENCE: " + goalDifference + "  POINTS: " + points  ;
        }

    }

}
