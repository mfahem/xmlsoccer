package pl.com.pablo.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by pmazur on 2014-11-30.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetHistoricMatchesResultDto {

    private Integer id;
    private Integer fixtureMatchId;
    private Date date;
    private Integer round;
    private String spectators;
    private String league;
    private String homeTeam;
    private Integer homeTeamId;
    private Integer homeCorners;
    private Integer homeGoals;
    private Integer halfTimeHomeGoals;
    private Integer homeShots;
    private Integer homeShotsOnTarget;
    private Integer homeFouls;
    private String homeGoalDetails;
    private String homeLineupGoalkeeper;
    private String homeLineupDefense;
    private String homeLineupMidfield;
    private String homeLineupForward;
    private Integer homeYellowCards;
    private Integer homeRedCards;
    private String homeTeamFormation;
    private String awayTeam;
    private Integer awayTeamId;
    private Integer awayCorners;
    private Integer awayGoals;
    private Integer halfTimeAwayGoals;
    private Integer awayShots;
    private Integer awayShotsOnTarget;
    private Integer awayFouls;
    private String awayGoalDetails;
    private String awayLineupGoalkeeper;
    private String awayLineupDefense;
    private String awayLineupMidfield;
    private String awayLineupForward;
    private Integer awayYellowCards;
    private Integer awayRedCards;
    private String awayTeamFormation;
    private String homeTeamYellowCardDetails;
    private String awayTeamYellowCardDetails;
    private String homeTeamRedCardDetails;
    private String awayTeamRedCardDetails;
    private String season;
}
