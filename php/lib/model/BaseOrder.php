<?php
/**
 * BaseOrder
 *
 * PHP version 5
 *
 * @category Class
 * @package  com.blockchain.exchange.rest
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Blockchain.com Exchange REST API
 *
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace com.blockchain.exchange.rest\com.blockchain.exchange.rest.model;

use \ArrayAccess;
use \com.blockchain.exchange.rest\ObjectSerializer;

/**
 * BaseOrder Class Doc Comment
 *
 * @category Class
 * @package  com.blockchain.exchange.rest
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class BaseOrder implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'BaseOrder';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cl_ord_id' => 'string',
        'ord_type' => '\com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\OrdType',
        'symbol' => 'string',
        'side' => '\com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\Side',
        'order_qty' => 'double',
        'time_in_force' => '\com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\TimeInForce',
        'price' => 'double',
        'expire_date' => 'int',
        'min_qty' => 'double',
        'stop_px' => 'double'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'cl_ord_id' => null,
        'ord_type' => null,
        'symbol' => null,
        'side' => null,
        'order_qty' => 'double',
        'time_in_force' => null,
        'price' => 'double',
        'expire_date' => null,
        'min_qty' => 'double',
        'stop_px' => 'double'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'cl_ord_id' => 'clOrdId',
        'ord_type' => 'ordType',
        'symbol' => 'symbol',
        'side' => 'side',
        'order_qty' => 'orderQty',
        'time_in_force' => 'timeInForce',
        'price' => 'price',
        'expire_date' => 'expireDate',
        'min_qty' => 'minQty',
        'stop_px' => 'stopPx'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cl_ord_id' => 'setClOrdId',
        'ord_type' => 'setOrdType',
        'symbol' => 'setSymbol',
        'side' => 'setSide',
        'order_qty' => 'setOrderQty',
        'time_in_force' => 'setTimeInForce',
        'price' => 'setPrice',
        'expire_date' => 'setExpireDate',
        'min_qty' => 'setMinQty',
        'stop_px' => 'setStopPx'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cl_ord_id' => 'getClOrdId',
        'ord_type' => 'getOrdType',
        'symbol' => 'getSymbol',
        'side' => 'getSide',
        'order_qty' => 'getOrderQty',
        'time_in_force' => 'getTimeInForce',
        'price' => 'getPrice',
        'expire_date' => 'getExpireDate',
        'min_qty' => 'getMinQty',
        'stop_px' => 'getStopPx'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['cl_ord_id'] = isset($data['cl_ord_id']) ? $data['cl_ord_id'] : null;
        $this->container['ord_type'] = isset($data['ord_type']) ? $data['ord_type'] : null;
        $this->container['symbol'] = isset($data['symbol']) ? $data['symbol'] : null;
        $this->container['side'] = isset($data['side']) ? $data['side'] : null;
        $this->container['order_qty'] = isset($data['order_qty']) ? $data['order_qty'] : null;
        $this->container['time_in_force'] = isset($data['time_in_force']) ? $data['time_in_force'] : null;
        $this->container['price'] = isset($data['price']) ? $data['price'] : null;
        $this->container['expire_date'] = isset($data['expire_date']) ? $data['expire_date'] : null;
        $this->container['min_qty'] = isset($data['min_qty']) ? $data['min_qty'] : null;
        $this->container['stop_px'] = isset($data['stop_px']) ? $data['stop_px'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['cl_ord_id'] === null) {
            $invalidProperties[] = "'cl_ord_id' can't be null";
        }
        if ((mb_strlen($this->container['cl_ord_id']) > 20)) {
            $invalidProperties[] = "invalid value for 'cl_ord_id', the character length must be smaller than or equal to 20.";
        }

        if ($this->container['ord_type'] === null) {
            $invalidProperties[] = "'ord_type' can't be null";
        }
        if ($this->container['symbol'] === null) {
            $invalidProperties[] = "'symbol' can't be null";
        }
        if (!preg_match("/^[A-Z]{3,5}-[A-Z]{3,5}$/", $this->container['symbol'])) {
            $invalidProperties[] = "invalid value for 'symbol', must be conform to the pattern /^[A-Z]{3,5}-[A-Z]{3,5}$/.";
        }

        if ($this->container['side'] === null) {
            $invalidProperties[] = "'side' can't be null";
        }
        if ($this->container['order_qty'] === null) {
            $invalidProperties[] = "'order_qty' can't be null";
        }
        if (!is_null($this->container['expire_date']) && ($this->container['expire_date'] > 20501231)) {
            $invalidProperties[] = "invalid value for 'expire_date', must be smaller than or equal to 20501231.";
        }

        if (!is_null($this->container['expire_date']) && ($this->container['expire_date'] < 20200101)) {
            $invalidProperties[] = "invalid value for 'expire_date', must be bigger than or equal to 20200101.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets cl_ord_id
     *
     * @return string
     */
    public function getClOrdId()
    {
        return $this->container['cl_ord_id'];
    }

    /**
     * Sets cl_ord_id
     *
     * @param string $cl_ord_id Reference field provided by client and cannot exceed 20 characters
     *
     * @return $this
     */
    public function setClOrdId($cl_ord_id)
    {
        if ((mb_strlen($cl_ord_id) > 20)) {
            throw new \InvalidArgumentException('invalid length for $cl_ord_id when calling BaseOrder., must be smaller than or equal to 20.');
        }

        $this->container['cl_ord_id'] = $cl_ord_id;

        return $this;
    }

    /**
     * Gets ord_type
     *
     * @return \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\OrdType
     */
    public function getOrdType()
    {
        return $this->container['ord_type'];
    }

    /**
     * Sets ord_type
     *
     * @param \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\OrdType $ord_type ord_type
     *
     * @return $this
     */
    public function setOrdType($ord_type)
    {
        $this->container['ord_type'] = $ord_type;

        return $this;
    }

    /**
     * Gets symbol
     *
     * @return string
     */
    public function getSymbol()
    {
        return $this->container['symbol'];
    }

    /**
     * Sets symbol
     *
     * @param string $symbol Blockchain symbol identifier
     *
     * @return $this
     */
    public function setSymbol($symbol)
    {

        if ((!preg_match("/^[A-Z]{3,5}-[A-Z]{3,5}$/", $symbol))) {
            throw new \InvalidArgumentException("invalid value for $symbol when calling BaseOrder., must conform to the pattern /^[A-Z]{3,5}-[A-Z]{3,5}$/.");
        }

        $this->container['symbol'] = $symbol;

        return $this;
    }

    /**
     * Gets side
     *
     * @return \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\Side
     */
    public function getSide()
    {
        return $this->container['side'];
    }

    /**
     * Sets side
     *
     * @param \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\Side $side side
     *
     * @return $this
     */
    public function setSide($side)
    {
        $this->container['side'] = $side;

        return $this;
    }

    /**
     * Gets order_qty
     *
     * @return double
     */
    public function getOrderQty()
    {
        return $this->container['order_qty'];
    }

    /**
     * Sets order_qty
     *
     * @param double $order_qty The order size in the terms of the base currency
     *
     * @return $this
     */
    public function setOrderQty($order_qty)
    {
        $this->container['order_qty'] = $order_qty;

        return $this;
    }

    /**
     * Gets time_in_force
     *
     * @return \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\TimeInForce|null
     */
    public function getTimeInForce()
    {
        return $this->container['time_in_force'];
    }

    /**
     * Sets time_in_force
     *
     * @param \com.blockchain.exchange.rest\com.blockchain.exchange.rest.model\TimeInForce|null $time_in_force time_in_force
     *
     * @return $this
     */
    public function setTimeInForce($time_in_force)
    {
        $this->container['time_in_force'] = $time_in_force;

        return $this;
    }

    /**
     * Gets price
     *
     * @return double|null
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param double|null $price The limit price for the order
     *
     * @return $this
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets expire_date
     *
     * @return int|null
     */
    public function getExpireDate()
    {
        return $this->container['expire_date'];
    }

    /**
     * Sets expire_date
     *
     * @param int|null $expire_date expiry date in the format YYYYMMDD
     *
     * @return $this
     */
    public function setExpireDate($expire_date)
    {

        if (!is_null($expire_date) && ($expire_date > 20501231)) {
            throw new \InvalidArgumentException('invalid value for $expire_date when calling BaseOrder., must be smaller than or equal to 20501231.');
        }
        if (!is_null($expire_date) && ($expire_date < 20200101)) {
            throw new \InvalidArgumentException('invalid value for $expire_date when calling BaseOrder., must be bigger than or equal to 20200101.');
        }

        $this->container['expire_date'] = $expire_date;

        return $this;
    }

    /**
     * Gets min_qty
     *
     * @return double|null
     */
    public function getMinQty()
    {
        return $this->container['min_qty'];
    }

    /**
     * Sets min_qty
     *
     * @param double|null $min_qty The minimum quantity required for an IOC fill
     *
     * @return $this
     */
    public function setMinQty($min_qty)
    {
        $this->container['min_qty'] = $min_qty;

        return $this;
    }

    /**
     * Gets stop_px
     *
     * @return double|null
     */
    public function getStopPx()
    {
        return $this->container['stop_px'];
    }

    /**
     * Sets stop_px
     *
     * @param double|null $stop_px The limit price for the order
     *
     * @return $this
     */
    public function setStopPx($stop_px)
    {
        $this->container['stop_px'] = $stop_px;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


