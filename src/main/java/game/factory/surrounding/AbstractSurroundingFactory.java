package game.factory.surrounding;


import game.environment.surrounding.obstacle.AbstractObstacle;
import game.environment.surrounding.obstacle.ObstacleType;
import game.environment.surrounding.platform.AbstractPlatform;
import game.environment.surrounding.platform.PlatformType;

abstract class AbstractSurroundingFactory {
    abstract AbstractObstacle getObstacle(ObstacleType type);
    abstract AbstractPlatform getPlatform(PlatformType type);
}
