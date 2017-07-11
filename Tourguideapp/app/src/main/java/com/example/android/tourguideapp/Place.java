package com.example.android.tourguideapp;

/**
 * Created by PB on 09/07/2017.
 */

/**
 * {@link Place} represents a visualization of a generic Place.
 * It contains resource IDs for the Image, Title and Description.
 */

public class Place {

    private int mTitleId;
    private int mDescriptionId;
    /** Image resource ID for the word */
    private int mImageId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param titleId is the string resource ID for the Title in the Card element
     * @param descriptionId is the string resource Id for the Description in the Card element
     */
    public Place(int titleId, int descriptionId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
    }

    /**
     * Create a new Place object.
     *
     * @param titleId is the string resource Id for the Title in the Card element
     * @param descriptionId is the string resource Id for the Description in the Card element
     * @param imageID is the image resource Id for the Image in the Card element
     */
    public Place(int titleId, int descriptionId, int imageID) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mImageId = imageID;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

}
