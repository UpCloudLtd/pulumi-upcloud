# Releasing a New Pulumi UpCloud Provider Version

This document explains how to release a new version of the [Pulumi UpCloud provider](https://github.com/UpCloudLtd/pulumi-upcloud) after a new [Terraform UpCloud provider](https://github.com/UpCloudLtd/terraform-provider-upcloud) release.

---

## Overview

The Pulumi provider is automatically updated to track the latest Terraform provider release via the **“Upgrade Provider”** GitHub workflow.  
This workflow:
- Detects the newest Terraform provider tag.  
- Regenerates and builds the Pulumi provider.  
- Updates version references automatically.

---

## Automatic Run

- The **Upgrade Provider** workflow runs **daily at 03:00 UTC**.  
- Once it completes successfully, the Pulumi repository’s `main` branch will contain the new version code.

---

## Manual Run (Optional)

If you don’t want to wait for the nightly job:

1. Go to **Actions → Upgrade Provider** in the Pulumi repository.  
2. Click **Run workflow → Run workflow manually**.  
3. Wait for the workflow to finish successfully.

---

## Creating the Release Tag

After the workflow finishes (automatically or manually):

1. Pull the latest `main` branch:
   ```bash
   git checkout main
   git pull origin main
   ```

2. Create and push a new tag:
   ```bash
   git tag vX.Y.Z
   git push origin vX.Y.Z
   ```
   Replace vX.Y.Z with the new semantic version (e.g. v5.30.0).

Pushing the tag triggers the Pulumi release workflow, which publishes new provider packages to all supported registries.

## Publication Delays
- npm, PyPI, NuGet, and Go packages usually appear within minutes to a few hours.
- The Pulumi Registry may take up to 24 hours to update the new version.