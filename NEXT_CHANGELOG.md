# NEXT CHANGELOG

## [Unreleased]

### Added
- Added support for disabling CloudFetch via `EnableQueryResultDownload=0` to use inline Arrow results instead.
- Implemented `setNetworkTimeout()` and `getNetworkTimeout()` methods on Connection to allow dynamic configuration of network I/O timeout for database operations. The timeout is applied per-request to allow changes to take effect immediately without recreating HTTP connections.

### Updated
- Implemented lazy loading for inline Arrow results, fetching arrow batches on demand instead of all at once. This improves memory usage and initial response time for large result sets when using the Thrift protocol with Arrow format.

### Fixed
- Fixed complex data type metadata support when retrieving 0 rows in Arrow format
- Normalized TIMESTAMP_NTZ to TIMESTAMP in Thrift path for consistency with SEA behavior

---
*Note: When making changes, please add your change under the appropriate section
with a brief description.*
