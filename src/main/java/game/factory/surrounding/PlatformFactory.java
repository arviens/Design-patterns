package game.factory.surrounding;

import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.object.surrounding.obstacle.ObstacleType;
import game.environment.object.surrounding.platform.DefaultPlatform;
import game.environment.object.surrounding.platform.PlatformType;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class PlatformFactory extends AbstractSurroundingFactory {

    public AbstractObstacle getObstacle(ObstacleType type) {
        return null;
    }

    public AbstractPlatform getPlatform(PlatformType platformType) {
        switch (platformType) {
            case DEFAULT:
                return new DefaultPlatform();
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