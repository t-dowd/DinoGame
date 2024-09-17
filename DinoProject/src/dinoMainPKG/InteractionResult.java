package dinoMainPKG;

/**
 * ~ CollisionMove: For when an entity pushes another entity or StdTile.
 * ~ CollisionOverlap: For when an entity Ovelaps and REMOVES an entity.
 * ~ PlatePressed: When an entity is in contact with a pressure plate.
 * ~ 
 * @author dowdt
 */
public enum InteractionResult {
	CollisionMove, CollisionRemove, PlatePressed, EndGame, Placeholder, None;
}
