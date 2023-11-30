package com.uol.host.backend.infra;

import com.uol.host.backend.model.GroupType;
import com.uol.host.backend.service.CodinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService codinameService;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVENGERS) {
            String firstMatch = codinameService.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.codinameService.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = codinameService.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.codinameService.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
