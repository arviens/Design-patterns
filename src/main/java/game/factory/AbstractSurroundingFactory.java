package game.factory;


import game.environment.surrounding.obstacle.AbstractObstacle;
import game.environment.surrounding.platform.AbstractPlatform;

abstract class AbstractSurroundingFactory {
    abstract AbstractObstacle getObstacle(ObstacleType type);
    abstract AbstractPlatform getPlatform(PlatformType type);
}
