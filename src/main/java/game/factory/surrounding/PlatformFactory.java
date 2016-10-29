package game.factory.surrounding;

import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class PlatformFactory {

    AbstractObstacle getObstacle(PlatformType obstacleType)
    {
        return null;
    }

    AbstractPlatform getPlatform(PlatformType platformType)
    {
        switch (platformType){
            case DEFAULT:
                System.out.println("default");
                break;
            case TEMPORARY:
                System.out.println("temporary");
            case SPIKE:
                System.out.println("spike");
            case LAVA:
                System.out.println("lava");
                break;
        }
        return null;
    }
}