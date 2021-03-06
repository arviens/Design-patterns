package game.factory.surrounding;

import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.object.surrounding.obstacle.ObstacleType;
import game.environment.object.surrounding.platform.PlatformType;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class ObstacleFactory extends AbstractSurroundingFactory {

     public AbstractObstacle getObstacle(ObstacleType obstacleType)
     {
         switch (obstacleType){
             case SPIKE:
                 System.out.println("spike");
                 break;
             case FENCE:
                 System.out.println("fence");
             case ROCK:
                 System.out.println("rock");
                 break;
         }
         return null;
     }

     public AbstractPlatform getPlatform(PlatformType type)
     {
         return null;
     }
}
