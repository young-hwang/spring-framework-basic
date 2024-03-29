package io.younghwang.springframeworkbasic.user.service;

import io.younghwang.springframeworkbasic.user.domain.Level;
import io.younghwang.springframeworkbasic.user.domain.User;

import static io.younghwang.springframeworkbasic.user.service.UserServiceImpl.MIN_LOGCOUNT_FOR_SILVER;
import static io.younghwang.springframeworkbasic.user.service.UserServiceImpl.MIN_RECOMMEND_FOR_GOLD;

public class UserLevelUpgradePolicyImpl implements UserLevelUpgradePolicy {
    @Override
    public boolean canUpgradeLevel(User user) {
        Level currentLevel = user.getLevel();
        switch (currentLevel) {
            case BASIC: return user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER;
            case SILVER: return user.getRecommend() >= MIN_RECOMMEND_FOR_GOLD;
            case GOLD: return false;
            default: throw new IllegalArgumentException("Unknown Level: " + currentLevel);
        }
    }

    @Override
    public void upgradeLevel(User user) {
        user.upgradeLevel();
    }
}
